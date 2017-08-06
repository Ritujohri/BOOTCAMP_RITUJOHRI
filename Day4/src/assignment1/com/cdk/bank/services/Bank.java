package assignment1.com.cdk.bank.services;

public class Bank {
	public static void main(String[] args) {
		AccountServiceImpl acc1 = new AccountServiceImpl();
		CustomerServiceImpl customer1 = new CustomerServiceImpl();
		acc1.open();
		acc1.withdraw(1000);
		acc1.balance();
		acc1.deposit(98879);
		acc1.balance();

		customer1.details();
		customer1.updateAddress("shashtri nagar pune");
		customer1.updateMobile(7874563);
		customer1.details();
	}
}