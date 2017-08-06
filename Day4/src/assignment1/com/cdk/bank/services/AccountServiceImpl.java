package assignment1.com.cdk.bank.services;


class AccountServiceImpl implements AccountService {

    private double balance;

    AccountServiceImpl() {
        this.balance = 100000;
    }

    public void open() {
        System.out.println("Account opened!!!");
    }

    public void close() {
        System.out.println("Account closed!!!");
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println(amount + " rs. withdrawn");
    }

    public void deposit(double amount) {
        balance  += amount;
        System.out.println(amount + " rs. deposited");
    }

    public void balance() {
        System.out.println("Balance : " + balance);
    }
}
