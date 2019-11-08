package Multithreading.waitNotify.ProducerCustomer;

public class Cup {

    private int contents;
    private boolean available = false;

    synchronized protected int get(){
        while (!available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    synchronized public void put(int value){
        while (available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = true;
        contents = value;
        notifyAll();
    }
}
