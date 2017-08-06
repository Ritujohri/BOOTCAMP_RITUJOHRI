package ComparatorAssignment;

import java.util.Comparator;

/**
 * Created by johrir on 7/25/2017.
 */
public class IdComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (o2.getId()-o1.getId());
    }
}
