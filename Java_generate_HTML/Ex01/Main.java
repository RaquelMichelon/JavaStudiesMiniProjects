import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        //Step 1. ask the user for a filename(or path)

        Scanner scanner = new Scanner(System.in);
        //to do input file connection
        Scanner fileIn;
        //HTML file connection
        PrintWriter fileOut;
        //original file name
        String filenameIn;
        //new HTML filenames
        String fileNameOut; 
        //hold the position of . in filenames - we will create a substring to do that
        int dotIndex;
        //line from the input file
        String line = null;

        System.out.println("Enter a file name or path: ");
        filenameIn = scanner.nextLine();


        //Step 2. Check if file exists
        try {
            fileIn = new Scanner(new FileReader(filenameIn));
            //Step 3. rename txt as html file
            dotIndex = filenameIn.lastIndexOf(".");
            if (dotIndex == -1) { 
                fileNameOut = filenameIn + ".html";
                //Hello --> will become Hello.html
            } else {
                fileNameOut = filenameIn.substring(0, dotIndex) + ".html";
                //hello.txt --> will become hello.html
            }
            fileOut = new PrintWriter(fileNameOut);


            //Step 4. determine if file is empty
            try {
                line = fileIn.nextLine();

            } catch(NoSuchElementException e) {
                System.out.println("Error: " + e.getMessage());
            }
            if(line == null) {
                System.out.println("The file is empty.");
            } else {
                //Step 5. read each line and insert necessary tags
                fileOut.println("<html>");
                fileOut.println("<head>");
                fileOut.println("</head>");
                fileOut.println("<body>");
                fileOut.println(line);

                while(fileIn.hasNextLine()) {
                    fileOut.println("<br>");
                    line = fileIn.nextLine();

                    if(line.isEmpty()) {
                        fileOut.println("<br>");
                    } else {
                        fileOut.println(line);
                    }

                }

                fileOut.println("</body>");
                fileOut.println("</html>");

                System.out.println("HTML file was processed!");

            }
            //it's necessary to close all scanners...
            fileIn.close();
            fileOut.close();



        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}