package Multithreading.callableFuture1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleClass {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.execute(new Task());
        }
        System.out.println("Thread in psvm: "+Thread.currentThread().getId());
    }
    static class Task implements Runnable{

        @Override
        public void run() {
            System.out.println("Thread: "+Thread.currentThread().getId());
        }
    }

}