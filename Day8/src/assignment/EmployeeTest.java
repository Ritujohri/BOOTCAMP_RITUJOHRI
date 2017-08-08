package assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by johrir on 7/27/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(210, "Ritu", 40500),
                new Employee(100, "Ritu", 40500),
                new Employee(101, "Priya", 40000),
                new Employee(102, "Priyal", 45000),
                new Employee(103, "Aakriti", 40050),
                new Employee(104, "Pragya", 30500),
                new Employee(105, "siddharth", 70500),
                new Employee(106, "Aditya", 60500),
                new Employee(107, "Pranali", 80500),
                new Employee(108, "Rituja", 20500),
                new Employee(109, "Akbar", 11500),
                new Employee(110, "Saleema", 30500),
                new Employee(111, "Ritima", 49500),
                new Employee(112, "pingu", 55500),
                new Employee(113, "Shiva", 98500),
                new Employee(114, "Ayushi", 65500),
                new Employee(115, "Arsh", 40500),
                new Employee(116, "Snigdha", 60500),
                new Employee(117, "Rituraj", 80500),
                new Employee(118, "Harsha", 20500),
                new Employee(119, "Rajan", 50500),
                new Employee(200, "Nikita", 90500),
                new Employee(201, "Jalaj", 99500)
        );
        List<Employee> richEmp = new ArrayList<>();
        for (Employee emp : list) {
            if (emp.getSalary() > 40000)
                richEmp.add(emp);
        }
        Collections.sort(richEmp);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\johrir\\IdeaProjects\\memory\\Day8\\src\\assignment\\employee.txt");
            oos = new ObjectOutputStream(fos);
            for (Employee e : richEmp) {
                oos.writeObject(e);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (oos != null)
                    oos.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
