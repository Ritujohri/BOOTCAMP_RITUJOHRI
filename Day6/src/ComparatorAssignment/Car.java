package ComparatorAssignment;

/**
 * Created by johrir on 7/25/2017.
 */
public class Car implements Comparable<Car> {
    int id;
    double price;
    String brand;

    public Car(int id, int price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if(this.price == o.price){
            return 0;
        }
        else if (this.price > o.price){
            return -1;
        }
        else
            return  1;
    }
}
