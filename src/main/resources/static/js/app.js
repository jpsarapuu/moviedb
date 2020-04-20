//  UI elements
const movieList = document.getElementById('movie-list');
const modalTitle = document.getElementById('modal-title');
const modalDescription = document.getElementById('modal-description');
const modalRating = document.getElementById('modal-rating');
const searchInput = document.getElementById('search-input');
const categories = document.getElementById('categories');
const filterBtn = document.getElementById('filter-btn');

let moviesResponse;
const movieMap = new Map();
const categorySet = new Set();

const moviesRequest = new XMLHttpRequest();

moviesRequest.open('GET', "http://localhost:8080/movies");
moviesRequest.onload = function () {
    moviesResponse = JSON.parse(this.responseText);
    initUI();
};
moviesRequest.send();

function initUI() {
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
          <div class="col">${movie.title}</div>
          <div class="col">${movie.year}</div>
          <div class="col">${movie.category.name}</div>
          <div class="col">${movie.rating}</div>
        </div>`;

        movieList.appendChild(a);
    });

    categorySet.forEach(function (category) {

        const formCheck = document.createElement('div');
        formCheck.className = 'form-check';
        formCheck.innerHTML = `
        <input type="checkbox" class="form-check-input" id="${category}">
        <label class="form-check-label" for="${category}">${category}</label>`;

        categories.appendChild(formCheck);
    });
}

movieList.addEventListener('click', function (e) {

    let movieId;

    if (e.target.classList.contains('list-group-item')) {
        movieId = e.target.id;
    } else if (e.target.parentElement.parentElement.classList.contains('list-group-item')) {
        movieId = e.target.parentElement.parentElement.id;
    }

    if (movieId !== undefined) {
        const movieReq = new XMLHttpRequest();
        movieReq.open('GET', movieMap.get(parseInt(movieId))._links.self.href);
        movieReq.onload = function () {
            const movie = JSON.parse(this.responseText);
            modalTitle.textContent = `${movie.title} (${movie.year})`;
            modalDescription.textContent = movie.description;
            modalRating.textContent = `Rating: ${movie.rating}`;
        };
        movieReq.send();
    }
});

searchInput.addEventListener('keyup', function () {

    const searchText = searchInput.value.toLowerCase();

    Array.from(movieList.children).forEach(function (movie) {

        const movieTitle = movie.firstElementChild.firstElementChild.textContent.toLowerCase();

        if (movieTitle.indexOf(searchText) === -1) {
            movie.style.display = 'none';
        } else {
            movie.style.display = '';
        }
    });
});

filterBtn.addEventListener('click', function () {

    const checkedCategories = [];

    Array.from(categories.children).forEach(function (category) {

        if (category.firstElementChild.checked) {
            checkedCategories.push(category.firstElementChild.id);
        }
    });

    console.log(checkedCategories);
    if (checkedCategories.length === 0) {
        checkedCategories.push('');
    }

    Array.from(movieList.children).forEach(function (movie) {

        movie.style.display = 'none';

        for (let checkedCategory of checkedCategories) {
            if (movieMap.get(parseInt(movie.id)).category.name.indexOf(checkedCategory) !== -1) {
                movie.style.display = '';
                break;
            }
        }
    });
});


