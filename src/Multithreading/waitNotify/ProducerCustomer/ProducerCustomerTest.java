package Multithreading.waitNotify.ProducerCustomer;

public class ProducerCustomerTest {

    public static void main(String[] args) {
        Cup c = new Cup();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        Consumer c2 = new Consumer(c, 2);
        p1.start();
        c1.start();
        c2.start();
    }
}
