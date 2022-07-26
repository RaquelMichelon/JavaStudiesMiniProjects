import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuessMovie {
    public static void main(String[] args) {
        //Step 1 read the movie list and display the whole list - done!
        //Step 2 randomly pick one movie and display it - done!
        Game game = new Game();
        String hiddenMovie = game.getRandomMovie(game.displayMovies());
        game.displayHiddenMovie(hiddenMovie);

        //Step 3 convert the letters to underscore and display it - done!
        game.convertTitleToUnderscore(hiddenMovie);

        //Step 4 start reading the user's input and search for it in the title - done!
        Scanner input = new Scanner(System.in);
        System.out.println("Type one letter: ");
        String userLetter = input.next();

        if (userLetter.isEmpty()) {
            System.out.println("You need to type at least one letter from A to Z... Try again!");
        } else if (userLetter.length() > 1) {
            System.out.println("Ops! You can just pick one letter by time. Try again!");
        } else if (userLetter.matches(".*[0-9].*")) {
            System.out.println("Ops! It must be a letter not a number. Try again!");
        } else {
            char[] letters = hiddenMovie.toCharArray();

            for (char letter : letters) {
                if (letter == ' ') {
                    System.out.print("   ");
                } else if (letter == userLetter.toCharArray()[0]) {
                    System.out.printf(" %s ", userLetter);
                } else {
                    System.out.print(" _ ");
                }
            }

        }

    }
}


//it's time to build your own project in Java, this time you'll be completing
// a game where the player gets to guess the movie name given the number of
// letters in it (pretty much like hangman but with movies)!
//The rules are simple, the computer randomly picks a movie title, and shows you
// how many letters it's made up of. Your goal is to try to figure out the movie
// by guessing one letter at a time.
//If a letter is indeed in the title the computer will reveal its correct
// position in the word, if not, you lose a point. If you lose 10 points, game over!
//BUT the more correct letters you guess the more obvious the movie becomes
// and at a certain point you should be able to figure it out.
//The program will randomly pick a movie title from a text file that contains a large
// list of movies.
//You can download a sample text file to play with from the resources tab
// or create your own list of movie titles.
//Once the computer picks a random title, it will display underscores "_" in place
// of the real letters, thereby only giving away the number of letters in the movie title.

//A simple design would be to have at least one more class called Game that
// will include methods responsible for handling a single guess or displaying the
// hidden movie title etc.
//
//Then have another class that contains the main method and controls the logic of
// reading the user's input and calling the methods in the Game class
