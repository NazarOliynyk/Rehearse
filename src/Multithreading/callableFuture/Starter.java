package Multithreading.callableFuture;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Starter {

    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(5);
        // es.execute(new MyRunnabel());
        Future<?> sub = es.submit(new MyCallable());

        Thread.sleep(1000);

        sub.cancel(true);
        System.out.println("sub.isCancelled(): "+sub.isCancelled());

        Integer id = (Integer) sub.get();
        System.out.println("id: "+id);

        System.out.println("Shutdown in going to happen");
        es.shutdown();
    }

}
class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() {

        try {
            System.out.println("Started: "+Thread.currentThread().getId());
            Thread.sleep(1);
//            long d1 = System.currentTimeMillis();
//            long d2 = System.currentTimeMillis();
//            while (d2<d1+5000){
//                d2 = System.currentTimeMillis();
//            }
            System.out.println("Finished: "+Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 99;
    }
}