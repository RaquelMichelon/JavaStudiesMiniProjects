import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Print the reverse string using internal java method

        String input, reverse = "";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase to reverse: ");
        input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);

        System.out.print("The reverse is: " + sb.reverse());

    }
}
