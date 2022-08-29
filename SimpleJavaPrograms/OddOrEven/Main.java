import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Check Odd and Even

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        boolean IsEven = number % 2 == 0;

        if(IsEven) {
            System.out.print("The number " + number + " is even.");
        } else {
            System.out.print("The number " + number + " is odd.");
        }

    }
}
