import java.util.Scanner;

public class ReadInput {
    public static String read() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type an Input Expression --> e.g. 4*3/2 ");
        String inputLine = input.nextLine();
        input.close();
        return inputLine;
    }
}
