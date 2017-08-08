package Day11_Assignment_ThreadPool;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by johrir on 8/1/2017.
 */
public class ConcurrentDemo {
    @Test
    public void testExecutorService() {
        TaskA taskA = new TaskA();
        Executor executor= Executors.newCachedThreadPool();
        for (int i = 0; i <500 ; i++) {
            executor.execute(taskA);
        }

    }
}

class TaskA implements Runnable {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            sum += i;
        }
        System.out.println("Sum : " + sum);
    }

}
