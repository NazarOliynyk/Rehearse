package Multithreading.volatileVars.first;

import java.util.Scanner;

class Counter extends Thread{

    // without volatile it may not work because the value of counting is cached in memory
    // private  boolean counting = true;
    private volatile boolean counting = true;

    private int counter = 1;
    @Override
    public void run() {
        while (counting){
            System.out.println(counter);
            counter ++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void stopCounting(){
        counting = false;
    }
}

public class Test {
    public static void main(String[] args) {
        Counter c = new Counter();
        // this will run it in main thread
        // c.run();
        c.start();

        Scanner stopCount = new Scanner(System.in);
        stopCount.nextLine();
        c.stopCounting();

    }
}
