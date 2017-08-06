package assignment1.bank.branch.account;

/**
 * Created by johrir on 8/6/2017.
 */
public class AccountServices extends  Account{
    protected AccountServices(String branchName, int accountNo, double balance, String accountType){
        super(branchName, accountNo, balance, accountType);
    }

    protected void display() {
        super.display();
        System.out.println("Account No. : " + accountNo);
        System.out.println("Balance : " + balance);
    }
}
