package assignment2;

/**
 * Created by johrir on 8/6/2017.
 */
abstract class Vehicle {
    private int vehicleNo;
    private String modle;
    private int speed;

    Vehicle() {
        this.vehicleNo = 123332;
        this.modle = "xuv";
        this.speed = 10;
    }

    Vehicle(int vehicleNo, String modle, int speed) {
        this.vehicleNo = vehicleNo;
        this.modle = modle;
        this.speed = speed;
    }


    void details() {
        System.out.println("Vehicle no:" + vehicleNo);
        System.out.println("Modle:" + modle);
        System.out.println("speed:" + speed);
    }

    abstract void drive();

    abstract void inspect();

}

