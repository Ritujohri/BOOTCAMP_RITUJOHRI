package Day11_Assignment_MultiThreading2;

import java.io.*;

/**
 * Created by johrir on 7/31/2017.
 */
public class MultiThreadingDemo {
    public static void main(String[] args) {

        ReadingThread1 thread1=new ReadingThread1();
        ReadingThread2 thread2= new ReadingThread2();
        thread1.start();
        thread2.start();
    }


}

class ReadingThread1 extends Thread {
    InputStream is =null;
    InputStreamReader isr= null;
    BufferedReader file = null;

    public void run(){
        try {
            is=new FileInputStream("C:\\Users\\johrir\\IdeaProjects\\memory\\cars.txt");
            isr = new InputStreamReader(is);
            file = new BufferedReader(isr);
            String readHead=file.readLine();
            while(readHead != null  ) {
                System.out.println(readHead);
                readHead=file.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ReadingThread2 extends Thread {
    InputStream is =null;
    InputStreamReader isr= null;
    BufferedReader file = null;

    public void run(){
        try {
            is=new FileInputStream("C:\\Users\\johrir\\IdeaProjects\\memory\\cars.txt");
            isr = new InputStreamReader(is);
            file = new BufferedReader(isr);
            String readHead=file.readLine();
            while(readHead != null) {
                System.out.println(readHead);
                readHead=file.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}