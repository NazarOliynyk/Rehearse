package Multithreading.tutorial.createThreads;

public class CreatingThreads {

    public static void main(String[] args) throws Exception{
        // it prints - main
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }

    private static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }
    }
    static class MyRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }
    }
}