public class SportsCar extends Car {
	
	public void display() {
		super.display();
		System.out.println("SportsCar");
	}

	public static void main(String[] args) {
		FlyingCar fly1 = new FlyingCar();
		SportsCar sport1 = new SportsCar();
		sport1.display();
		fly1.display();

	}
	
}