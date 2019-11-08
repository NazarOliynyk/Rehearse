package Multithreading.atomics.second;



import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    private static AtomicInteger at = new AtomicInteger(0);

    private static class MyRunnable implements Runnable {

        private int myCounter;
        private int myPrevCounter;
        private int myCounterPlusFive;
        private boolean isNine;

        public void run() {

            myCounter = at.incrementAndGet();
            // counter was 0 but was incremented to 1
            System.out.println("Thread " + Thread.currentThread().getId() + "  / Counter : " + myCounter);
            myPrevCounter = at.getAndIncrement();
            // here it returns 1 that was before  at.getAndIncrement();
            System.out.println("Thread " + Thread.currentThread().getId() + " / Previous : " + myPrevCounter);
            myCounterPlusFive = at.addAndGet(5);
            // here it adds 5 to 2 because 1 was incremented before
            System.out.println("Thread " + Thread.currentThread().getId() + " / plus five : " + myCounterPlusFive);
            isNine = at.compareAndSet(9, 3);
            if (isNine) {
                System.out.println("Thread " + Thread.currentThread().getId()
                        + " / Value was equal to 9, so it was updated to " + at.intValue());
            }

        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}