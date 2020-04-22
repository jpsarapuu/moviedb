// GLOBAL VARIABLES
// ---------------------------------------------------------------------------------------------------------------------

// UI elements
const movieList = document.getElementById('movie-list');
const modalTitle = document.getElementById('modal-title');
const modalDescription = document.getElementById('modal-description');
const modalRating = document.getElementById('modal-rating');
const searchInput = document.getElementById('search-input');
const categories = document.getElementById('categories');
const cardHeader = document.getElementById('card-header');

// XHR response for getMovies()
let moviesResponse;

// Data structures
const movieMap = new Map();
const categorySet = new Set();

// For reversing already sorted movie list
let sortedColumnId;



// PAGE SETUP
// ---------------------------------------------------------------------------------------------------------------------

// Initial request
const moviesRequest = new XMLHttpRequest();

moviesRequest.open('GET', "http://localhost:8080/movies");
moviesRequest.onload = function () {
    moviesResponse = JSON.parse(this.responseText);
    initUI();
};
moviesRequest.send();

function initUI() {

    // Create an anchor for every movie with movie ID
    moviesResponse._embedded.tupleBackedMapList.forEach(function (movie) {

        movieMap.set(movie.id, movie);
        categorySet.add(movie.category.name);

        const a = document.createElement('a');
        a.id = movie.id;
        a.href = '#prompt';
        a.className = 'list-group-item list-group-item-action bg-dark text-light';
        a.setAttribute('data-toggle', 'modal');

        a.innerHTML = `
        <div class="row">
          <div class="col-5">${movie.title}</div>
          <div class="col">${movie.year}</div>
          <div class="col">${movie.category.name}</div>
          <div class="col">${movie.rating.toFixed(1)}</div>
        </div>`;

        movieList.appendChild(a);
    });

    // Create a checkbox for every category
    categorySet.forEach(function (category) {

        const formCheck = document.createElement('div');
        formCheck.className = 'form-check';
        formCheck.innerHTML = `
        <input type="checkbox" class="form-check-input" id="${category}">
        <label class="form-check-label" for="${category}">${category}</label>`;

        categories.appendChild(formCheck);
    });
}



// EVENT LISTENERS
// ---------------------------------------------------------------------------------------------------------------------

// GET request for a single movie
movieList.addEventListener('click', function (e) {

    let movieId;

    // Retrieve movie ID
    if (e.target.classList.contains('list-group-item')) {
        movieId = e.target.id;
    } else if (e.target.parentElement.parentElement.classList.contains('list-group-item')) {
        movieId = e.target.parentElement.parentElement.id;
    }

    if (movieId !== undefined) {
        // Ask server for more details via movie ID
        const movieReq = new XMLHttpRequest();
        movieReq.open('GET', movieMap.get(parseInt(movieId))._links.self.href);
        movieReq.onload = function () {
            const movie = JSON.parse(this.responseText);
            modalTitle.textContent = `${movie.title} (${movie.year})`;
            modalDescription.textContent = movie.description;
            modalRating.textContent = `Rating: ${movie.rating}`;

            // Request an image from https://api.themoviedb.org
            const imageReq = new XMLHttpRequest();
            imageReq.open('GET', `https://api.themoviedb.org/3/movie/${movie.id}?api_key=cea3b7a0b210db1ea9f3707365849dd8&language=en-US`);
            imageReq.onload = function () {

                const response = JSON.parse(this.responseText);
                const img = document.createElement('img');
                img.className = 'img-fluid mt-3';
                img.src = `http://image.tmdb.org/t/p/w500${response.backdrop_path}`;

                modalDescription.appendChild(img);
            };
            imageReq.send();
        };
        movieReq.send();
    }
});

// Sort movies by column
cardHeader.addEventListener('click', function (e) {

    e.preventDefault();

    if (e.target.tagName === 'A') {

        // Get all movies from DOM
        const movies = Array.from(movieList.children);

        // If movies are already sorted by requested column, reverse the results
        if (e.target.id === sortedColumnId) {

            // Toggle the triangle indicator
            if (e.target.nextElementSibling.textContent === ' ▼') {
                e.target.nextElementSibling.textContent = ' ▲';
            } else if (e.target.nextElementSibling.textContent === ' ▲') {
                e.target.nextElementSibling.textContent = ' ▼';
            }
            movies.reverse();

        } else {

            // Clear all triangles
            Array.from(cardHeader.firstElementChild.children).forEach(function (child) {
                child.children[1].textContent = '';
            });

            // Choose sorting method
            switch (e.target.id) {
                case 'title-btn':
                    movies.sort((a, b) =>
                        a.firstElementChild.children[0].textContent.localeCompare(b.firstElementChild.children[0].textContent));
                    e.target.nextElementSibling.textContent = ' ▲';
                    break;
                case 'year-btn':
                    movies.sort((a, b) =>
                        parseInt(b.firstElementChild.children[1].textContent) - parseInt(a.firstElementChild.children[1].textContent));
                    e.target.nextElementSibling.textContent = ' ▼';
                    break;
                case 'category-btn':
                    movies.sort((a, b) =>
                        a.firstElementChild.children[2].textContent.localeCompare(b.firstElementChild.children[2].textContent));
                    e.target.nextElementSibling.textContent = ' ▲';
                    break;
                case 'rating-btn':
                    movies.sort((a, b) =>
                        parseFloat(b.firstElementChild.children[3].textContent) - parseFloat(a.firstElementChild.children[3].textContent));
                    e.target.nextElementSibling.textContent = ' ▼';
                    break;
            }

            // Save column ID for potential reversals
            sortedColumnId = e.target.id;
        }

        // Append movies in sorted order
        movies.forEach(function (movie) {
            movieList.appendChild(movie);
        });
    }
});

searchInput.addEventListener('keyup', applyFilters);

categories.addEventListener('change', applyFilters);



// HELPER FUNCTIONS
// ---------------------------------------------------------------------------------------------------------------------

// Handle searching and filtering
function applyFilters() {

    const searchText = searchInput.value.toLowerCase();
    const checkedCategories = [];

    Array.from(categories.children).forEach(function (category) {
        if (category.firstElementChild.checked) {
            checkedCategories.push(category.firstElementChild.id);
        }
    });

    // If no category is selected, check against an empty string - effectively showing all movies
    if (checkedCategories.length === 0) {
        checkedCategories.push('');
    }

    Array.from(movieList.children).forEach(function (movie) {

        const movieTitle = movie.firstElementChild.firstElementChild.textContent.toLowerCase();

        // Hide movie by default
        movie.style.display = 'none';

        // Show movie if both search and category conditions are met
        if (movieTitle.indexOf(searchText) !== -1) {
            for (let checkedCategory of checkedCategories) {
                if (movieMap.get(parseInt(movie.id)).category.name.indexOf(checkedCategory) !== -1) {
                    movie.style.display = '';
                    break;
                }
            }
        }
    });
}