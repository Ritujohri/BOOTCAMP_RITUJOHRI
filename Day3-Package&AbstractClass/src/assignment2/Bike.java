package assignment2;

/**
 * Created by johrir on 8/6/2017.
 */
class Bike extends Vehicle {
    private String bikeType;

    Bike() {

    }
    Bike(int vehicleNo, String modle, int speed, String bikeType) {
        super(vehicleNo, modle, speed);
        this.bikeType = bikeType;

    }

    void details() {
        super.details();
        System.out.println("Bike typw:" + bikeType);
    }

    void drive() {
        System.out.println("you are driving bike");
    }

    void inspect() {
        System.out.println("Inspecting a bike");
    }
}