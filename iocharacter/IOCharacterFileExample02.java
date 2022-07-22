package com.michelon.iocharacter;

import java.io.*;
import java.util.Scanner;

/**
 * TASK: type 3 movies and write them on one .txt file
 */

public class IOCharacterFileExample02 {

    public static void readTypeWriteDoc() throws IOException {

        //aberto o fluxo para a escrita no console
        PrintWriter pw = new PrintWriter(System.out);

        pw.println("Digite três recomendações de filmes ['fim' para encerrar]: ");

        pw.flush();

        //abrir o teclado
        Scanner scan = new Scanner(System.in);
        //pra pegar cada linha
        String line = scan.nextLine();

        //criar o documento na raiz do projeto
        //classe file para auxiliar na manipulacao do arquivo
        File file = new File("recomendations.txt");

        //criar o documento
        BufferedWriter bw = new BufferedWriter(new FileWriter(file.getName()));

        //escrever no documento até digitar a palavra "fim"
        do {
            //escreva a linha no documento
            bw.write(line);
            bw.newLine();
            //descarregar
            bw.flush();
            //carregar a proxima linha
            line = scan.nextLine();

        } while(!(line.equalsIgnoreCase("fim")));

        pw.printf("File \"%s\" created successfully", file.getName());

        pw.close();
        scan.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        readTypeWriteDoc();
    }


}
