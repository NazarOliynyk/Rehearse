package Multithreading.paralelRun;

// 1. Local variables are visible only in ProcessorSimplestWay thread, static var and class members- in all threads
// 2. Process contains all threads
// 3. Dead Lock - ProcessorSimplestWay thread is holding ProcessorSimplestWay resource and waiting for another thread to get free
//    and the same about atomics thread - waiting for the first resource to get free.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        Ticker first = new Ticker("First");
        Ticker second = new Ticker("Second");
        // the following starts all code from first and then all code from atomics
//        first.run();
//        atomics.run();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(first);
        executorService.submit(second);
    }
}
