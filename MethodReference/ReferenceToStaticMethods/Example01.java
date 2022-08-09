import java.util.Arrays;
import java.util.List;

/*
Method Reference: special type of lambda expression;
There are 4 kinds:
- static methods
- instance methods of particular objects
- instance methods of an arbitrary object of a particular type
- constructor
 */
public class Example01 {

    public static void main(String[] args) {

        //reference to a static method

        List<String> list = Arrays.asList("hello", "java", "world!");

        //capitalize and print a string list using lambda expression
        list.forEach(word -> StringUtils.capitalize(word));

        //or using method reference
        list.forEach(StringUtils::capitalize);

    }
}
