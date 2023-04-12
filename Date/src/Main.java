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