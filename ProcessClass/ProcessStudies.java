package com.michelon.dropsmartstudies;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProcessStudies {

    public static void knownJavaVersion() throws IOException {

        boolean found = false;

        // start the process
        Process process = new ProcessBuilder("java", "-version").start();

        // create a scanner with the InputStream of the process
        Scanner scan = new Scanner( process.getInputStream() );

        while ( scan.hasNextLine() ) {
            System.out.println( scan.nextLine() );

            // verify if the name of the process is in that line
            // and sign to "found"
            found = scan.nextLine().contains( "java" );

        }

        // imprime true if found the process, false if don't.
        System.out.println( found );


    }



    public static void main(String[] args) {
        try {
            knownJavaVersion();
        }
        catch (IOException ioe) {
            System.err.println("Something went wrong! -->" + ioe.getMessage());
        }

    }
}
