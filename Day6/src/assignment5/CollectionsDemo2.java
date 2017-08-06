package assignment5;

import assignment2SRP.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by johrir on 7/25/2017.
 */
public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ritu",3000.00));
        list.add(new Employee("Priya",30000.00));
        list.add(new Employee("Priyal",34000.00));
        list.add(new Employee("Adi",16000.00));
        list.add(new Employee("Sidharth",36411.90));
        list.add(new Employee("Bhoomi",30070.00));
        list.add(new Employee("preetika",10000.00));
        list.add(new Employee("ayush",23000.00));
        list.add(new Employee("yasha",25000.00));
        list.add(new Employee("rishi",30000.00));

        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()){
            Employee next = itr.next();
            if (next.getSalary() < 20000){
                next.setSalary(1.20 * next.getSalary());
            }
            System.out.println(next.getSalary());

        }

    }
}
