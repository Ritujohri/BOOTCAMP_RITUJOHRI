package assignment2SRP;

public class AccountService {
    public AccountService() {
    }

    void udateSalary(double salary) {
        salary += 0.2 * salary;
        System.out.println("Salary updated!!!");
    }

    double calculateTDS(double salary) {

        return 0.2 * salary;
    }
}