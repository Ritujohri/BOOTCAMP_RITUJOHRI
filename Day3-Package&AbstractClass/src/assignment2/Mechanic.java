package assignment2;

/**
 * Created by johrir on 8/6/2017.
 */
public class Mechanic {
    public static void main(String[] args) {
        Bike bike1 = new Bike(1123, "x65", 60,"SportsBike");
        Car car1 = new Car();
        bike1.drive();
        bike1.details();
        bike1.inspect();
        car1.drive();
        car1.details();
        car1.inspect();

    }
}
