import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Java Stream Operations
Source: https://stackify.com/streams-guide-java-8/
Next study: Method Types and Pipelines
 */
public class Main {
    public static void main(String[] args) {

        //ForEach()
        //forEach() is a terminal operation, which means that, after the operation is performed,
        // the stream pipeline is considered consumed, and can no longer be used
        employeeList.stream().forEach(employee -> employee.incrementSalary(10.5));


        //map()
        //map() produces a new stream after applying a function to each element of the original stream.
        //The following example converts the stream of Integers into the stream of Employees.
        //we obtain an Integer stream of employee ids from an array. Each Integer is passed
        //to the function employeeRepository::findById() – which returns the corresponding
        // Employee object; this effectively forms an Employee stream.
        Integer[] employeeIds = {1, 2, 3};
        List<Employee> employees = Stream.of(employeeIds)
                .map(employeeRepository::findById)
                .collect(Collectors.toList());


        //collect()
        //one of the common ways to get stuff out of the stream once we are done with all the processing
        // In the example above, we used the toList collector to collect all Stream elements into a List instance.
        List<Employee> employees1 = employeeList.stream().collect(Collectors.toList());


        //filter()
        //produces a new stream that contains elements of the original one that pass a given test
        //In the example bellow, we first filter out null references for invalid
        // employee ids and then again apply a filter to only keep employees with
        // salaries over a certain threshold
        Integer[] employeeIds = {1, 2, 3};
        List<Employee> employees2 = Stream.of(employeeIds)
                .map(employeeRepository::findById)
                .filter(e -> e != null)
                .filter(e -> e.getIncome() > 300)
                .collect(Collectors.toList());


        //findFirst()
        //indFirst() returns an Optional for the first entry in the stream; the Optional can, of course, be empty
        //the first employee with the salary greater than 100 is returned. If no such employee exists, then null is returned
        Integer[] empIds = {1,2,3};
        Employee employee = Stream.of(empIds)
                .map(employeeRepository::findById)
                .filter(e -> e!= null)
                .filter(e -> e.getIncome() > 100)
                .findFirst()
                .orElse(null);



        //toArray() - d to get an array out of the stream
        //The syntax Employee[]::new creates an empty array of Employee – which is then
        // filled with elements from the stream
        Employee[] employees3 = employeeList.stream().toArray(Employee[]::new);



        //flatMap()
        //A stream can hold complex data structures like Stream<List<String>>.
        // In cases like this, flatMap() helps us to flatten the data structure
        // to simplify further operations
        //we are able to convert the Stream<List<String>> to a simpler Stream<String> – using the flatMap()
        List<List<String>> nestedNames = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = nestedNames.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());



        //peek()
        //sometimes we need to perform multiple operations on each element of the
        // stream before any terminal operation is applied.
        //peek() can be useful in situations like this.
        //peek() is an intermediate operation
        //Here, the first peek() is used to increment the salary of each employee.
        // The second peek() is used to print the employees. Finally,
        // collect() is used as the terminal operation.
        Employee[] arrayOfEmp = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmp);

        empList.stream()
                .peek(e -> e.incrementSalary(10.0))
                .peek(System.out::println)
                .collect(Collectors.toList());

    }

    private static Employee[] employeesArray = {
            new Employee(1, "Raquel M", 300.0),
            new Employee(2, "Sarah H", 3000.0),
            new Employee(3, "Carlos R", 5000.0)
    };

    private static List<Employee> employeeList = Arrays.asList(employeesArray);


}
