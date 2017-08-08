package Lambda;

import org.junit.Test;

/**
 * Created by johrir on 7/29/2017.
 */
public class ArrayHolderTest {
    int[] value = {10, 23, 56, 44, 89, 33};
    ArrayHolder arr = new ArrayHolder(value);

    @Test
    public void testForEach() {
        {
            arr.forEach((val) -> System.out.println(val));

        }
    }

    @Test
    public void testModify() {
        arr.modify((val) -> {
            return val * 5;
        });
    }

    @Test
    public void testDelete() {
        System.out.println(arr.delete((val) -> val % 2 == 0));
    }

    @Test
    public void testFold() {
        arr.fold((val1,val2)->val1+val2);

    }
}
