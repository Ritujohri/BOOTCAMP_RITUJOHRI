package assignment2;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * Created by johrir on 8/1/2017.
 */
public class PrimeNumberGeneratorTask1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum1 = 0;
        for (int i = 1; i < 100; i++) {
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (isDivisibleBy(i, j)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                sum1 += i;
        }
        return sum1;
    }

    private static boolean isDivisibleBy(int no, int i) {
        return no % i == 0;
    }
}
