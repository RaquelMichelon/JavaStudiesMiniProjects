import java.io.File;
import java.util.Scanner;
//our definition of words is something between one space and another
public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("pg63203.txt");
        Scanner scanner = new Scanner(file);

        int quantityWords = 0;

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            quantityWords += line.split(" ").length;
        }
        System.out.println("The file contains" + quantityWords + "words!"); 
    }
}
