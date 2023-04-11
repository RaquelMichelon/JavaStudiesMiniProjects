import domain.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exercise for ArrayList manipulation and lambda expressions
 * @author RaquelMichelon
 */
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Raquel", 2.500));
        employees.add(new Employee(2, "Carlos", 3.500));
        employees.add(new Employee(3, "Regina", 6.500));

        //increment salary of id 3 by 20%
        Integer id = 3;
        Double percentage = 20.0;
        Employee e = employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElse(null);

        if (e == null) {
            System.out.println("Id not found!");
        } else {
            e.incrementSalary(percentage);
        }

        System.out.println();

        System.out.println("Employee List:");
        employees.forEach(System.out::println);

        //search by id:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Search by Id - What id?");
        int employeeId = scanner.nextInt();

        if(existsId(employees, employeeId)) {
            System.out.println("This id is on the list");
        } else {
            System.out.println("Id not found!");
        }


    }

    public static boolean existsId(List<Employee> employeeList, int id) {
        Employee e = employeeList.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElse(null);
        return e != null;
    }
}

// -----------------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------------

//domain/model/Employee.java
package domain.model;

/**
 * Exercise for ArrayList manipulation and lambda expressions
 * @author RaquelMichelon
 */
public class Employee {

    private Integer id;
    private String name;
    private Double salary;


    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void incrementSalary(double percentual) {
        this.salary += this.salary * (percentual / 100.0);
    }

    @Override
    public String toString() {
        return "Employee: " + name + " - Salary: " + String.format("%.2f", salary);
    }
}
