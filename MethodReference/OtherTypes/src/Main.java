import java.util.Arrays;
import java.util.List;

/*
Method Reference: special type of lambda expression;
There are 4 kinds:
- static methods
- instance methods of particular objects
- instance methods of an arbitrary object of a particular type
- constructor

Their main limitation is a result of what's also their biggest strength: the output from the previous expression needs
to match the input parameters of the referenced method signature.

//check 2 classes and 1 interface created to this demo
 */
public class Main {

    public static void main(String[] args) {

        //reference to an Instance Method of a Particular Object example

        BicycleComparator bikeFrameSizeComparator = new BicycleComparator();

        //sort the bicycles by frame size using lambda expression - it is necessary to specify 2 bikes for comparison
        createBikeList.stream().sorted((a, b) -> bikeFrameSizeComparator.compare(a, b));

        //or do the same using method reference
        createBikeList().stream().sorted(bikeFrameSizeComparator::compare);





        //reference to an Instance Method of an Arbitrary Object of a particular type
        //is similar to the previous example, but without having to create a custom object to perform the comparison
        List<Integer> numbers = Arrays.asList(1, 7, 38, 90, 6, 28, 8, 2, 0, 98);

        //sort the list using lambda expressions
        numbers.stream().sorted((a, b) -> a.compareTo(b));

        //or do the same using method reference
        numbers.stream().sorted(Integer::compareTo);





        //Reference to a constructor
        //add a new constructor to Bicycle class
        //we'll use the new keyword
        List<String> bikeBrands = Arrays.asList("Caloi", "Scott", "Trek");

        //use our new constructor from a method reference and make a Bicycle array from the original String list:
        bikeBrands.stream().map(Bicycle::new).toArray(Bicycle[]::new);




        //Limitation
        //the case bellow can't be expressed with a method reference
        //printf requires 3 parameters, but createBicyclesList().forEach() only allow the method reference to infer 1 parameter
        createBicyclesList().forEach(b -> System.out.printf(
                "Bike brand is '%s' and frame size is '%d'%n",
                b.getBrand(),
                b.getFrameSize()));



        //how to create a no-operation function that can be referenced from a lambda expression
        //lambda expression without using its parameters
        //As it is a varargs method, it will work in any lambda expression
        //using varargs we can call our method with an arbitrary number of arguments
        private static <T> void doNothingAtAll(Object... o) {
        }
            
        //IN ACTION WILL RESULT IN:
        createBicyclesList()
                .forEach((o) -> Main.doNothingAtAll(o));
    }
}
