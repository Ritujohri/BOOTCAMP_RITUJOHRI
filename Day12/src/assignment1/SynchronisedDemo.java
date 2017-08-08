package assignment1;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by johrir on 8/1/2017.
 */
public class SynchronisedDemo {
    LinkedBlockingQueue<Double> list =new LinkedBlockingQueue<>();
    public static void main(String[] args) {
        new SynchronisedDemo();
    }
    public SynchronisedDemo(){
        new Thread(()->{
            while (true)
            list.offer(Math.random());
        }).start();
        new Thread(()->{
            try {
                while (true)
                System.out.println(list.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
