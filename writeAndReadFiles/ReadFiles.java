package readfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFiles {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("/Users/raqueldarellimichelon/Documentos/IFSC/IoTProject/javabasics/src/fileswritten/text.txt");

        List<String> lines = Files.readAllLines(filePath);

        for (int i = 0; i < lines.size(); i++) {
            String line =  lines.get(i);
            System.out.println(line);
        }

    }



}
