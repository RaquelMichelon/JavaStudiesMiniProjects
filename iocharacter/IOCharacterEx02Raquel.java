package com.michelon.iocharacter;

import java.io.*;
import java.util.Scanner;

public class IOCharacterEx02Raquel {

    public static void readTypeWriteDoc() throws IOException {

        //classe PrintWriter para printar no console a mensagem ao user
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Faça sua lista de compras! Type [fim] para sair.");
        pw.flush();

        //abertura do teclado e selecao de linha por linha
        Scanner entrada = new Scanner(System.in);
        String line = entrada.nextLine();

        //definir nome do arquivo
        File nameFile = new File("lista.txt");
        //criar doc - lanca excecao
        BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile.getName()));

        //loop para escrever no documento enquanto "fim" nao for digitado
        do {
            //escrever, inserir nova linha, descarregar, ir para nova linha
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = entrada.nextLine();

        } while(!(line.equalsIgnoreCase("fim")));

        //message to the user
        pw.printf("File \"%s\" created successfully", nameFile.getName());

        //fechamento de fluxos
        pw.close();
        entrada.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        readTypeWriteDoc();
    }
}
