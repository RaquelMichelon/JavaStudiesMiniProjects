import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Print the reverse string

        String input, reverse = "";


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase to reverse: ");
        input = scanner.nextLine();

        int length = input.length();

        for (int i = length -1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        System.out.print("The reverse is: " + reverse);

    }
}
