package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by johrir on 7/29/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Ritu", 50000),
                new Employee("Ritu", 50000),
                new Employee("shivam", 46000),
                new Employee("priya", 267888),
                new Employee("priyadud", 26799),
                new Employee("rui", 45000),
                new Employee("priyal", 55000),
                new Employee("shiva", 67000),
                new Employee("harsh", 123456),
                new Employee("harshdjsiwj", 78900),
                new Employee("harshdjsiwjch", 78900),
                new Employee("shubham", 9800),
                new Employee("madhuri", 56778),
                new Employee("kshipra", 735711),
                new Employee("shivani", 6125612),
                new Employee("kushal", 61250),
                new Employee("tushar", 788999),
                new Employee("tanmay", 34000),
                new Employee("shivanh", 67677),
                new Employee("prateek", 78266),
                new Employee("saba", 2300),
                new Employee("shweta", 13412),
                new Employee("shiraj", 555555),
                new Employee("harshala", 89700)
        );


        double total = employeeList.stream()
                .filter((emp)-> emp.getSalary()>50000)
                .map((emp)-> 0.1 * emp.getSalary())
                .reduce((acc,salary)-> acc+salary).get();
        System.out.println("total tds : "+ total);
        Double collect = employeeList.stream()
                .collect(Collectors.summingDouble((o) -> o.getSalary()));
        System.out.println("Total of salaries " +collect);
        Double totalSalary = employeeList.stream()
                .collect(Collectors.averagingDouble((o)->o.getSalary()));
        System.out.println("Average" + totalSalary);
        Optional<Employee> minSalary = employeeList.stream()
                .collect(Collectors.minBy((emp1,emp2)-> (int)emp1.getSalary()-(int)emp2.getSalary()));
        System.out.println("min salary" + minSalary);
        Optional<Employee> maxSalary = employeeList.stream()
                .collect(Collectors.maxBy((emp1,emp2)-> (int)emp1.getSalary()-(int)emp2.getSalary()));
        System.out.println("max salary" + maxSalary);
        int count = (int) employeeList.stream().count();
        System.out.println("no. of employees" + count);

    }
}
