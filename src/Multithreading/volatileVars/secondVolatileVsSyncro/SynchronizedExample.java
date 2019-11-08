package Multithreading.volatileVars.secondVolatileVsSyncro;

// this class works by itself, the rest two in this package are connected

// https://www.youtube.com/watch?v=ygL815TEDXo

// As I understood when we use atomicInteger - it already contains all synchronized methods

public class SynchronizedExample {

    private  int count =0;
    //private  volatile  int count =0;

    private  void incrementCount(){
        count = count + 1;
    }

//    private synchronized void incrementCount(){
//        count = count + 1;
//    }

    public static void main(String[] args) {

        SynchronizedExample example = new SynchronizedExample();
        example.doTheJob();
        System.out.println("psvm: "+Thread.currentThread().getName());
    }

    private void doTheJob(){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                     incrementCount();
                }
                System.out.println("t1.run(): "+Thread.currentThread().getName());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    incrementCount();
                }
                System.out.println("t2.run(): "+Thread.currentThread().getName());
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The final value of counter is: "+ count);
    }
}
