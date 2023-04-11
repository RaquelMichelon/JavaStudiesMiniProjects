import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       //iteration - Java 8
      
        List<String> characters = Arrays.asList("Mickey", "Minnie", "Pateta", "Pluto");

        //Mission: iterate the list and print content
      
        //Solution 1: fore-ach loop - external iteration
        for (String character : characters) {
            System.out.println(character);
        }

        //solution 2: internal iteration - method foreach
        characters.forEach(character -> System.out.println(character));

        //solution 3: or just replace the lambda function for the method reference
        characters.forEach(System.out::println);


    }
}
