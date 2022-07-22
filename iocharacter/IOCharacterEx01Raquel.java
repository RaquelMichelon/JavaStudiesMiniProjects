package com.michelon.iocharacter;

import java.io.*;

public class IOCharacterEx01Raquel {

    public static void readAndRepeat() throws IOException {

        //input
        System.out.println("Shopping List: ");
        //InputStream escuta o teclado; Buffered recebe o InputStream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //leitura de cada linha
        String eachLine = br.readLine();

        //fluxo de saida
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(eachLine);
            bw.newLine();
            eachLine = br.readLine();

        } while(!(eachLine.isEmpty()));

        //descarregar e fechar o fluxo
        bw.flush();
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        readAndRepeat();
    }
}
