package Day11_Assignment_MultiThreading;

/**
 * Created by johrir on 7/31/2017.
 */
class MultiThreadingDemo {
    int i = 0;

    public static void main(String[] args) throws InterruptedException {
        new MultiThreadingDemo();
        System.out.println("end");
    }

    public MultiThreadingDemo() {

        new Thread(() -> {
            for (int j = 0; j < 10; j++)
                i++;

        }).start();
        new Thread(() -> {
            for (int j = 0; j < 10; j++)
                System.out.println(i);

        }).start();

    }
}
