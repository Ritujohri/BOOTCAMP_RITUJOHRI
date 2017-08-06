package assignment1.com.cdk.bank.services;

interface AccountService {
    public void open();
    public void close();
    public void withdraw(double amount);
    public void deposit(double amount);
    public void balance();
}