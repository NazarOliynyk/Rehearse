package Multithreading.callableFuture1;

// https://www.youtube.com/watch?v=NEZ2ASoP_nY

import java.util.Random;
import java.util.concurrent.*;

public class SimpleCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService service = Executors.newFixedThreadPool(10);

        Future<Integer> future= service.submit(new TaskCallable());

        // if timeout is less than 3 - it will throw timeoutException-

        Integer result = future.get(4, TimeUnit.SECONDS);
        System.out.println("future.isDone(): "+future.isDone());
        System.out.println("future.isCancelled(): "+future.isCancelled());
        System.out.println("result: "+result);
        System.out.println("Thread in psvm: "+Thread.currentThread().getName());
        future.cancel(true);
    }
    static class TaskCallable implements Callable<Integer>{

        @Override
        public Integer call() {
            System.out.println("Thread in call(): "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new Random().nextInt();
        }
    }
}
