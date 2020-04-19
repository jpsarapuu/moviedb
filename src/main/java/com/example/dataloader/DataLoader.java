package com.example.dataloader;

import com.example.model.Category;
import com.example.model.Movie;
import com.example.repository.CategoryRepository;
import com.example.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private MovieRepository movieRepository;
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category scifi = new Category("Sci-Fi");
        Category drama = new Category("Drama");
        Category comedy = new Category("Comedy");

        categoryRepository.save(scifi);
        categoryRepository.save(drama);
        categoryRepository.save(comedy);

        Movie matrix = Movie.builder().title("The Matrix").category(scifi).year(1999).rating(8.7).description(
                "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in" +
                        " the war against its controllers.").build();

        Movie room = Movie.builder().title("The Room").category(drama).year(2003).rating(3.7).description(
                "Johnny is a successful bank executive who lives quietly in a San Francisco townhouse with his future" +
                        " wife, Lisa. One day, putting aside any scruple, she seduces Johnny's best friend, Mark. " +
                        "From there, nothing will be the same again.").build();

        Movie superbad = Movie.builder().title("Superbad").category(comedy).year(2007).rating(7.6).description(
                "Two co-dependent high school seniors are forced to deal with separation anxiety after their plan to " +
                        "stage a booze-soaked party goes awry.").build();

        Movie spaceOdyssey = Movie.builder().title("2001: A Space Odyssey").category(scifi).year(1968).rating(8.3).description(
                "After discovering a mysterious artifact buried beneath the Lunar surface, mankind sets off on a " +
                        "quest to find its origins with help from intelligent supercomputer H.A.L. 9000.").build();

        movieRepository.save(matrix);
        movieRepository.save(room);
        movieRepository.save(superbad);
        movieRepository.save(spaceOdyssey);
    }
}
