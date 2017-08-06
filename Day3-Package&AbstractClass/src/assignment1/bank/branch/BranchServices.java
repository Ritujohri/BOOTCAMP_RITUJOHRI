package assignment1.bank.branch;

public class BranchServices {
	protected String branchName;
	int noOfCustomers;
	
	protected BranchServices(String branchName) {
		this.branchName = branchName; 
	}
	
	protected void openAccount() {
		System.out.println("Account Opened ");
	}

	
	protected void display() {
		System.out.println("branch name: " + branchName);
	}
	
	
}