import java.util.Scanner;

/**
 * If/else and switch
 * @author RaquelMichelon
 */
public class Main {
    public static void main(String[] args) {

        //chatbot simulation
        System.out.println("---------------------------------------------------");
        System.out.println("Welcome! Choose one option:");
        System.out.println("1. Order Pizza");
        System.out.println("2. Order Sushi");
        System.out.println("3. Order Cake");
        System.out.println("4. Talk to an attendant");
        System.out.print("Type the number of the desired option:");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.close();

        // refactored: using switch and returning a value from it

        String message = switch (option) {
            case 1 -> "Redirecting you to the Pizza Menu...";
            case 2 -> "Redirecting you to the Sushi Menu...";
            case 3 -> "Redirecting you to the Cake Menu...";
            case 4 -> "Redirecting you to one Attendant...";
            default -> "Invalid Option";
        };

        System.out.println(message);




        // using switch

//        switch (option) {
//            case 1 -> System.out.println("Redirecting you to the Pizza Menu...");
//            case 2 -> System.out.println("Redirecting you to the Sushi Menu...");
//            case 3 -> System.out.println("Redirecting you to the Cake Menu...");
//            case 4 -> System.out.println("Redirecting you to one Attendant...");
//            default -> System.out.println("Invalid Option");
//        }




        // using if - else if - else

//        if(option == 1)
//            System.out.println("Redirecting you to the Pizza Menu...");
//        else if(option == 2)
//            System.out.println("Redirecting you to the Sushi Menu...");
//        else if(option == 3)
//            System.out.println("Redirecting you to the Cake Menu...");
//        else if(option == 4)
//            System.out.println("Redirecting you to one Attendant...");
//        else
//            System.out.println("Invalid Option");





    }
}