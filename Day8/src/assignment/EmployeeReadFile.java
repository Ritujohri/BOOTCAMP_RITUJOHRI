package assignment;

import java.io.*;

/**
 * Created by johrir on 7/27/2017.
 */
public class EmployeeReadFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("C:\\Users\\johrir\\IdeaProjects\\memory\\Day8\\src\\assignment\\employee.txt");
            ois = new ObjectInputStream(fis);
            while (ois!=null) {
                Employee emp = (Employee) ois.readObject();
                System.out.println(emp + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
