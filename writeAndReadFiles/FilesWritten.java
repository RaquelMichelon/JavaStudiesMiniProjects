package fileswritten;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesWritten {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //to create the file content
        ArrayList<String> lines = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.print("Task [" + (i+1) + "]: ");
            String item = scanner.nextLine();

            lines.add(item);
        }

        //to create the file path
        Path filePath = Paths.get("/Users/raqueldarellimichelon/Documentos/IFSC/IoTProject/javabasics/src/fileswritten/text.txt");

        Files.write(filePath, lines);

        scanner.close();
    }
}
