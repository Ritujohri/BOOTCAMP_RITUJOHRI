package assignment1.bank.branch.account;
import assignment1.bank.branch.BranchServices;

public class Account extends BranchServices {
	final protected int accountNo;
	protected double balance;
	String accountType;

	public Account(String branchName, int accountNo, double balance, String accountType) {
		super(branchName);
		this.accountNo = accountNo;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	protected void display() {
		System.out.println("accountNo. : " + accountNo);
		System.out.println("balance : " + balance);
		System.out.println("accountType : " + accountType);
	}
	
}

