package com.michelon.dropsmartstudies;

import java.io.IOException;
import java.util.Scanner;

public class ProcessStudies02 {

    public static void main(String[] args) {

        String[] command = {"ls"};
        try {
            Process process = new ProcessBuilder(command).start();
            Scanner scan = new Scanner(process.getInputStream());
            while(scan.hasNext()) {
                System.out.println("Ls process: " + scan.next());
            }
            scan.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
