class Automobile {

	private double speed;
	private long vin;
	
	Automobile() {
		this.speed = 10;
		this.vin = 112434;
	}
	
	
	
	void start(){
		System.out.println("Started.....");
	}

	void accelerate() {
		speed += 5;	
	}

	void brake() {
		speed -= 5;	
	}

	void stop() {
		System.out.println("Stoped.....");
	}
	
	void display() {
		System.out.println("Speed : " + this.speed);
		System.out.println("vin : " + this.vin);
	}

	
}