import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Print the reverse number

        int number, reverse = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        number = scanner.nextInt();

        while(number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }

        System.out.print("The reverse is " + reverse);

    }
}
