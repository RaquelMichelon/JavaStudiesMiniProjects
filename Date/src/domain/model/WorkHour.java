import domain.model.Department;
import domain.model.Employee;
import domain.model.WorkHour;
import enuns.JobLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Exercise for classes associations, enums, Date manipulation
 * @author RaquelMichelon
 */
public class Main {
    public static void main(String[] args) {

//        4. What's object cloning?
//        5. Can you write me a Java program to find whether a number is prime?
//        6. Will you write a Java program to find the duplicate characters in a string?
//        7. What are the differences between HashMap and HashTable in Java?
//        8. How's inheritance in C++ different from Java?
//        9. Can you write me a Selenium code to switch to the previous tab?
//        10. Can you overload or override static methods in Java?

        Locale.setDefault(Locale.US);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Employee employee1 = new Employee("Raquel Michelon",
                JobLevel.valueOf("JUNIOR"), 4.500, new Department("IT", "Information Technology"));

        try {
            Date date = dateFormat.parse("01/07/2022");
            double hourValue = 44;
            int workedHours = 160;
            WorkHour contract = new WorkHour(date, hourValue, workedHours);
            employee1.addContract(contract);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month/year to calculate the income. MM/YYYY");

        String monthYear = scanner.nextLine();

        Integer month = Integer.parseInt(monthYear.substring(0, 2));
        Integer year = Integer.parseInt(monthYear.substring(3));

        System.out.println("name: " + employee1.getName());
        System.out.println("department: " + employee1.getDepartment().getSlug());
        System.out.println("Income: " + monthYear + " - "+ String.format("%.2f", employee1.calculateIncome(year, month)));


        scanner.close();



    }
}