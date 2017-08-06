package assignment1.bank.branch.client;
import assignment1.bank.branch.account.AccountServices;

public class Customer extends AccountServices {
	private final long customerId;
	String name;
	
	public Customer(String branchName,int accountNo,double balance, String accountType, long customerId, String name) {
		super(branchName,accountNo, balance, accountType);
		this.customerId = customerId;
		this.name = name;
	}
	
	protected void credit(double amount) {
		balance += amount;
	}

	protected void debit(double amount) {
		balance -= amount;
	}

	public static void main(String[] args) {
		Customer customer1 = new Customer("kalyani nagar",12112323, 28000, "SavingsAcc", 1123, "Jaggu");
		customer1.credit(1000);
		customer1.debit(500);
		customer1.display();
	}
}
