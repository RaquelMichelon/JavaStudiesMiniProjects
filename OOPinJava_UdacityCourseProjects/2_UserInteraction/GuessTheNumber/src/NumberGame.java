import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        //Math.random() will return a random float number
        int computerRandomNumber = (int) (Math.random() * 100) + 1; //+1 to guarantee that the number will not be zero
        System.out.println("I have randomly choose a number from 1 to 100.");
        System.out.println("Try to guess it!");
        Scanner input = new Scanner(System.in);
        boolean hasWon = false;
        //the user have ten chances to guess the number
        for (int i = 10; i > 0; i--) {
            System.out.println("You already have " + i + "guess(es) left! Choose again: ");
            //to do: put a treatment in case the user type something different from a number
            int guessNumber = input.nextInt();

            if(computerRandomNumber < guessNumber) {
                System.out.printf("Actually it is a smaller number than %d", guessNumber);
            }
            else if(computerRandomNumber > guessNumber) {
                System.out.printf("Actually it is grater than %d", guessNumber);
            }
            else {
                hasWon = true;
                break; //if the person win, break down the loop
            }
        }
        if(hasWon) {
            System.out.println("Correct! You Won!!! :)");
        } else {
            System.out.println("Game Over... You lose! :(");
            System.out.printf("The number was %d", computerRandomNumber);
        }
    }
}
