import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Streams are wrappers around the data source, allowing to operate large processes;
A Stream does not store data and never modifies the data source
 */
public class Main {
    public static void main(String[] args) {
        //JAVA STREAM CREATION
        //1 obtaining a stream of an existing array
        Stream.of(employeesArray);

        //2 obtaining a stream from an existing list
        employeeList.stream();

        //3 create a stream from individual objects
        Stream.of(employeesArray[0], employeesArray[1], employeesArray[2]);

        //4 using Stream.builder()
        Stream.Builder<Employee> streamBuilder = Stream.builder();
        streamBuilder.accept(employeesArray[0]);
        streamBuilder.accept(employeesArray[1]);
        streamBuilder.accept(employeesArray[2]);
        Stream<Employee> streamOfEmployees = streamBuilder.build();
    }

    private static Employee[] employeesArray = {
            new Employee(1, "Raquel M", 300.0),
            new Employee(2, "Sarah H", 3000.0),
            new Employee(3, "Carlos R", 5000.0)
    };

    private static List<Employee> employeeList = Arrays.asList(employeesArray);


}
