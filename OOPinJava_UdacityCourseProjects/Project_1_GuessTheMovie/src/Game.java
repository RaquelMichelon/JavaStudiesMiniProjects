import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private String movieName;

    //handle a single guess

    //convert hidden title to underscore
    public void convertTitleToUnderscore(String title) {
        char[] letters = title.toCharArray();
        for (char letter : letters) {
            if (letter == ' ') {
                System.out.print("   ");
            } else {
                System.out.print(" _ ");
            }
        }
    }

    //display the hidden movie title
    public void displayHiddenMovie(String title) {
        System.out.printf("The picked movie was: %s %n", title);
    }

    //set the name of the movie
    public String getRandomMovie(List<String> allMovies) {
        allMovies = displayMovies();
        Random chooseMovie = new Random();
        return allMovies.get(chooseMovie.nextInt(allMovies.size()));
    }

    //get the movies from a file
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
        return moviesList;
    }

}
