package Multithreading.atomics.first;


import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInt {
    static AtomicInteger a = new AtomicInteger(0);



    public static void main(String[] args) throws Exception{
        for (int j = 0; j < 10000; j++) {
            new MyThread().start();
        }
        Thread.sleep(1000);
        // it always prints exactly 10000
        System.out.println(a.get());
    }

    private static class MyThread extends Thread{

        @Override
        public void run(){
            a.incrementAndGet();
        }
    }
}
