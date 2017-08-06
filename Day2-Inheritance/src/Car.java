public class Car extends Automobile {
	
	private int noOfSeats;
	private String model;
	
	public Car() {
		this.noOfSeats = 5;
		this.model = null;
	}
	
	public void display() {
		super.display();
		System.out.println("NoOfSeats : " + noOfSeats);
		System.out.println("Models : " + model);
	}
	
	}