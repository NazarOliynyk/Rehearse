package Multithreading.syncronized.syncriniz;

public class Test {

    public static void main(String[] args) {

        Cup cup = new Cup(0);
        // bob increases coffee per 1 each time
        Waiter bob = new Waiter(cup);
        // steve decreases coffee per 1 each time
        Customer steve = new Customer(cup);
        bob.start();
        steve.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // this gives either 10 or -10 each time if the methods inside Cup class are not synchronized
        System.out.println("\n"+ cup.getCoffee());
        // in case if those methods are synchronized it gives 0 (pour +1, sip -1 and ...)
    }
}
