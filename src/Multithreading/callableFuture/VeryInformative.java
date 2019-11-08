package Multithreading.callableFuture;


//   https://www.youtube.com/watch?v=j9FA0C2pdkA


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VeryInformative {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(5);
       // es.execute(new MyRunnabel());
        Future<?> sub = es.submit(new MyRunnable());


        while (!sub.isDone()){
            System.out.println("Is not done");
            Thread.sleep(1000);
        }

        System.out.println("Shutdown in going to happen");
        es.shutdown();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {

        try {
            System.out.println("Started: "+Thread.currentThread().getId());
            Thread.sleep(5000);
            System.out.println("Finished: "+Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
