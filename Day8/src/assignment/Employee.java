package assignment;

import java.io.Serializable;

/**
 * Created by johrir on 7/27/2017.
 */
public class Employee implements Comparable, Serializable{
    int id;
    String name;
    transient double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee e=(Employee)o;
        return this.getId()-e.getId();
    }
}
