package assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by johrir on 8/1/2017.
 */
public class PrimeNumberSum{
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(5);
       List<Future<Integer>> futureList=Arrays.asList(executor.submit(new PrimeNumberGeneratorTask1()),
               executor.submit(new PrimeNumberGeneratorTask2()),
               executor.submit(new PrimeNumberGeneratorTask3()),
               executor.submit(new PrimeNumberGeneratorTask4()),
               executor.submit(new PrimeNumberGeneratorTask5()));
       int sum=0;
        for (int i = 0; i <futureList.size() ; i++) {
            try {
                sum+=futureList.get(i).get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Sum :" + sum);
    }

}
