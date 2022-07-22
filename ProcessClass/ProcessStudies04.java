package com.michelon.dropsmartstudies;

import java.io.*;

public class ProcessStudies04 {

    public static void main(String[] args) {
        try {
            Process p = new ProcessBuilder("cal", "2022").start();

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

            BufferedWriter bw=new BufferedWriter(new FileWriter(new File("my_calendar2022.txt")));

            String line;

            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            br.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
