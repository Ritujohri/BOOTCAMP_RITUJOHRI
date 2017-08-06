package assignment2;

/**
 * Created by johrir on 8/6/2017.
 */

class Car extends Vehicle {
   private int noOfSeats;

    void details() {
        super.details();
        System.out.println("no of seats " + noOfSeats);
    }

    void drive() {
        System.out.println("you are driving car");
    }

    void inspect() {
        System.out.println("Inspecting a bike");
    }

}