package Multithreading.tutorial.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.i = 5;
        resource.j = 5;
        MyThread myThread = new MyThread();
        myThread.setName("one");
        MyThread myThread1 = new MyThread();
        myThread.resource = resource;
        myThread1.resource = resource;
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join();

        System.out.println("resource.i: "+resource.i);
        System.out.println("resource.j: "+resource.j);
    }
    private static class MyThread extends Thread{

        Resource resource;
        @Override
        public void run() {
            resource.changeI();
            resource.changeJ();
        }
    }
}



class Resource {
    int i;
    int j;
    // unless it is-
    //synchronized void changeI(){
    // it shoul give different results each time we run - because myThread and myThread1
    // fight for resource

    // or use lock:
    private Lock lock = new ReentrantLock();

        void changeI(){

        lock.lock();
        int i = this.i;
        if(Thread.currentThread().getName().equals("name")){
            Thread.yield();
        }
        i++;
        this.i = i;

    }

        void changeJ(){


            int j = this.j;
            if(Thread.currentThread().getName().equals("name")){
                Thread.yield();
            }
            j++;
            this.j = j;
            lock.unlock();
        }

}
