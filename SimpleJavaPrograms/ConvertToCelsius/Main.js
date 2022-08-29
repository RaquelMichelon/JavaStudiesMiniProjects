import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fahrenheit to Celsius

        Scanner scanner = new Scanner(System.in);
        System.out.print("What Fahrenheit temperature would you like to convert to Celsius? Type: ");
        float temperature = scanner.nextFloat();

        temperature = ((temperature - 32)*5) / 9;

        System.out.print("The temperature in Celsius is: " + temperature);

    }
}
