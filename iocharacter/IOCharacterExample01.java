package com.michelon.iocharacter;

import java.io.*;

/**
 * TASK = open the type to write some movies that you like and show them on the console
 */

public class IOCharacterExample01 {

    public static void receivedFromTypePrintOnConsole() throws IOException {

        //Open type - fluxo de entrada

//        InputStream is = System.in; //receiving from type
//        InputStreamReader isr = new InputStreamReader(is); //convert to character
//        BufferedReader br = new BufferedReader(isr); //armazena em um buffer

        System.out.println("Recomende 3 filmes: ");

        //o que está acima em padrão de projeto decorator
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //leitura de cada linha digitada
        String line = br.readLine();

        //fluxo de saida para o console
//        OutputStream os = System.out;
//        OutputStreamWriter osw = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(osw);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {

            //escrever no fluxo de saida
            bw.write(line);
            bw.newLine();
            //recarregar a linha para repetir o processo
            line = br.readLine();

        } while(!(line.isEmpty()));

        //como estamos lendo e escrevendo dentro de um buffer é preciso descarregar
        bw.flush();
        //para fechar o fluxo
        br.close();
        bw.close();

        //command f9

    }

    public static void main(String[] args) throws IOException {
        receivedFromTypePrintOnConsole();
    }


}
