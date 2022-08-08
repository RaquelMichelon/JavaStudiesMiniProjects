//input stream is a source for reading data
//it can represent various kinds of data such as disk files, devices, other programs, and memory array
//it can support bytes, primitive data types, characters and objects
//Subclasses -> AudioInputStream, ByteArrayInputStream, FileInputStream, FilterInputStream,
// ObjectInputStream, PipedInputStream, and SequenceInputStream

//Remember to use try-with-resources or close() method
//

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class InputStreamExamples {
    public static void main(String[] args) throws IOException {

        //1 - Read text

        String filePath = "testFile.txt";

        //The text file is read with FileInputStream, InputStreamReader, and BufferedReader.
        //FileInputStream is a specialization of the InputStream for reading bytes from a file.
        try (InputStream is = new FileInputStream(filePath);//try with resource example
            //InputStreamReader is a bridge from byte streams to character streams: it reads
            // bytes and decodes them into characters using a specified charset.
             InputStreamReader isr = new InputStreamReader(is,
                     StandardCharsets.UTF_8);
            //BufferedReader reads text from a character-input stream, buffering characters for
            // efficient reading of characters, arrays, and lines.
             //The data is read by lines from a buffered reader.
             BufferedReader br = new BufferedReader(isr)) {
                br.lines().forEach(line -> System.out.println(line));
            }

        //2 - Read bytes
        //read bytes from a PNG image and prints the bytes in hexadecimal format to the console.

        String filePath2 = "image.png";
        //We use FileInputStream to read bytes from an image file.
        try (InputStream input = new FileInputStream(filePath2)) {
            byte[] bufferArray = new byte[input.available()];
            //With the read method, we read the bytes into the array of bytes.
            input.read(bufferArray);

            //We go through the array and print the bytes to the console in hexadecimal format
            int i = 0;
            for (byte b : bufferArray) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.printf("%02x ", b);
                i++;
            }
        }

        System.out.println();

        //3 - read data from a URL source
        //open an InputStream to a web page and reads its data.
        String webPage = "https://links-showcase.vercel.app/";

        URL url = new URL(webPage);
        ////An InputStream to a URL is created with openStream method
        try (InputStream is = url.openStream();
             BufferedReader br = new BufferedReader(
                     new InputStreamReader(is))) {
            br.lines().forEach(System.out::println);
        }

        //4 - read file using FileInputStream
        byte[] array = new byte[222];
        try{
            InputStream inputStream = new FileInputStream("testFile.txt");
            System.out.println("Available bytes in the file: " + inputStream.available());

            //read byte from the input stream
            inputStream.read(array);

            //convert byte array into string
            String dataString = new String(array);
            System.out.println(dataString);

            //close the input stream
            inputStream.close();

        } catch (Exception e) {
        e.getStackTrace();
    }


    }


}
