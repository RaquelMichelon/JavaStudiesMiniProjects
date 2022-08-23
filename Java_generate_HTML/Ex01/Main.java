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

    }
}