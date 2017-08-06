package assignment4;

import assignment2SRP.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by johrir on 7/25/2017.
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ritu",30000.00));
        list.add(new Employee("Priya",30000.00));
        list.add(new Employee("Priyal",30000.00));
        list.add(new Employee("Adi",30000.00));
        list.add(new Employee("Sidharth",30000.00));
        list.add(new Employee("Bhoomi",30000.00));
        list.add(new Employee("preetika",30000.00));
        list.add(new Employee("ayush",30000.00));
        list.add(new Employee("yasha",30000.00));
        list.add(new Employee("rishi",30000.00));

        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()){
            Employee next = itr.next();
            System.out.println(next.getName() + " " + next.getSalary() + " " + next.calHRA(next.getSalary()));


        }

    }

}
