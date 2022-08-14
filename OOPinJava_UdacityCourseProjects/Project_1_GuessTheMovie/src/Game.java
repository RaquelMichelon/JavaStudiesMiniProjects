import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private String movieName;

    //set the name of the movie

    //handle a single guess

    //display the hidden movie title
    public void displayMovies() {
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
    }

}

