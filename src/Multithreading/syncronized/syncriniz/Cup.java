package Multithreading.syncronized.syncriniz;

public class Cup {

    private int coffee;

    public Cup(int coffee) {
        this.coffee = coffee;
    }

    synchronized public int getCoffee() {
        return coffee;
    }

    synchronized public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    // another thread can not use synchronized code
    // it just locks the object

    synchronized void drink(){
        int localCoffee = coffee;
        localCoffee--;
        System.out.print(" Sip ");
        try {
            Thread.sleep((long) (100*Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        coffee = localCoffee;
    }

    synchronized void pour(){
        int localCoffee = coffee;
        localCoffee++;
        System.out.print(" Pour ");
        try {
            Thread.sleep((long) (100*Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        coffee = localCoffee;
    }
}
