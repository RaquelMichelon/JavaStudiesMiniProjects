import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {

        //usign stream with collections
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        numberList.stream().forEach(System.out::println); //1 2 3 4 5


        //with array
        Integer[] arrayList = new Integer[] {1, 2, 3, 4, 5};
        Arrays.stream(arrayList).forEach(System.out::println); //1 2 3 4 5


        //with Stream.of -> to create stream of any value
        //Stream<String> ss = Stream.of("hello", "java", "world");
        //.of will accept any kind of object
        Stream.of("hello", "java", "world").forEach(System.out::println); //hello java world


        //with IntStream.range
        //stream between 0 and 5
        IntStream.range(0, 6).forEach(System.out::println); //1 2 3 4 5
        IntStream.rangeClosed(0, 5).forEach(System.out::println); //1 2 3 4 5


        //with StreamIterate -> it's common to create a limit of loops to prevent infinite loop
        //n -> n * 2 = in the first loop is 5 * 2, in the second is 10 * 2 , and so on
        Stream.iterate(5, n -> n * 2).limit(10).forEach(System.out::println); //5 10 20 40 80 160 320 640 1280 2560



        //BufferedReader - lines
        //testFile.txt //11 12 13 each one in a separated line
        File file = new File("testFile.txt");
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(fr)) {
            br.lines().forEach(System.out::println); //11 12 13
        }




        //Files - to work with files in a directory not with the content
        Path path = Paths.get(""); //to have all subdirectories of one directory
        Files.list(path).forEach(System.out::println);



        //Random - streams of random integers
        new Random()
                .ints() //create a stream
                .limit(10) //limit of numbers
                .forEach(System.out::println); //process




        //Pattern - to work with regex - regular expressions
        Pattern p = Pattern.compile(" ");
        String s = "Hi, java world!";
        p.splitAsStream(s).forEach(System.out::println);

    }
}
