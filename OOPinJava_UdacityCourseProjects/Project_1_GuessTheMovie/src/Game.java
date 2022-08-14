import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private String movieName;

    //set the name of the movie
    public void getRandomMovie(List<String> allMovies) {
        allMovies = displayMovies();
        Random chooseMovie = new Random();
        String selectedMovie = allMovies.get(chooseMovie.nextInt(allMovies.size()));
        System.out.printf("Picked movie is: %s", selectedMovie);
    }

    //handle a single guess

    //display the hidden movie title
    public List<String> displayMovies() {
        File file = new File("movies.txt");
        List<String> moviesList = new ArrayList<String>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(scanner.hasNextLine()) {
            moviesList.add(scanner.nextLine());
        }
        System.out.println(moviesList);

        return moviesList;
    }

}
