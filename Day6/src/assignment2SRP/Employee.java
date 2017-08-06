package assignment2SRP;

/**
 * Created by johrir on 7/25/2017.
 */
public class Employee {
    String name;
    Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public double calHRA(double salary){
        return 0.3 * salary;
    }
}

