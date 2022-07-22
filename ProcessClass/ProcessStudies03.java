package com.michelon.dropsmartstudies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessStudies03 {

    public static void main(String[] args) {

        try {
            Process p = new ProcessBuilder("cal", "2022").start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        System.out.println("************************************");
    }

}
