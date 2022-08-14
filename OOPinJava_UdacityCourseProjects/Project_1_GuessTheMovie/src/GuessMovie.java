import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GuessMovie {
    public static void main(String[] args) {
        //Step 1 read the movie list and display the whole list - done!
        Game game = new Game();
        game.displayMovies();

//        int randomNumber = (int) Math.random() * moviesList.size();
//
//        for (String movie : moviesList) {
//            if()
//        }
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
