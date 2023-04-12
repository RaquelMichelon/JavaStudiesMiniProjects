package domain.model;

import enuns.JobLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @autor raqueldarellimichelon
 * created on 12/04/23 inside the package - domain.model
 **/
public class Employee {
    private String name;
    private JobLevel level;
    private Double baseSalary;
    private Department department;
    private List<WorkHour> contracts;

    public Employee() {
    }

    public Employee(String name, JobLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobLevel getLevel() {
        return level;
    }

    public void setLevel(JobLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<WorkHour> getContracts() {
        return contracts;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }

    public void addContract(WorkHour contract) {
        if(this.contracts == null) {
            this.contracts = new ArrayList<>();
        }
        this.contracts.add(contract);
    }

    public void removeContract(WorkHour contract) {
        this.contracts.remove(contract);
    }

    public Double calculateIncome(Integer year, Integer month) {
        Double sum = this.baseSalary;
        Calendar calendar = Calendar.getInstance();

        for(WorkHour workhour : this.contracts) {
            calendar.setTime(workhour.getDate());
            int workYear = calendar.get(Calendar.YEAR);
            int workMonth = calendar.get(Calendar.MONTH);

            if(workYear == year && workMonth == month) {
                sum += workhour.calculateTotalValue();
            }
        }

        return sum;
    }
}


