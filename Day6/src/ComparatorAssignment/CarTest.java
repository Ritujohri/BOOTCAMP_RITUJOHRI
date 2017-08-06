package ComparatorAssignment;

import java.util.*;

/**
 * Created by johrir on 7/25/2017.
 */
public class CarTest {
    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
        cars.add(new Car(110, 400000, "hyundai"));
        cars.add(new Car(126, 450000, "Tata"));
        cars.add(new Car(156, 500000, "chevrolet"));
        cars.add(new Car(467, 500050, "maruti"));
        cars.add(new Car(657, 533050, "honda"));
        cars.add(new Car(637, 567050, "hyundai"));
        cars.add(new Car(767, 700050, "mercedes"));
        cars.add(new Car(167, 675478, "audi"));
        cars.add(new Car(897, 666789, "mahindra"));
        cars.add(new Car(567, 980000, "tata"));
        cars.add(new Car(344, 654444, "tata"));
        cars.add(new Car(987, 600000, "hyundai"));
        cars.add(new Car(547, 100000, "hyundai"));
        cars.add(new Car(464, 540000, "mahindra"));
        cars.add(new Car(422, 6644559, "chevrolet"));
        cars.add(new Car(223, 540000, "chevrolet"));
        cars.add(new Car(233, 230000, "tata"));
        cars.add(new Car(234, 887000, "tata"));
        cars.add(new Car(286, 900000, "hyundai"));
        cars.add(new Car(777, 760000, "maruti"));
        cars.add(new Car(998, 230000, "maruti"));

        Iterator<Car> itr = cars.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("-----------------------------------");
        List<Car> list = new ArrayList<>(cars);
        Collections.sort(list,new BrandComparator());
        Iterator<Car> itr1 = list.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("-----------------------------------");
        List<Car> list1 = new ArrayList<>(cars);
        Collections.sort(list1,new IdComparator());
        Iterator<Car> itr2 = list.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}