package Multithreading.Mutex_Semaphore.SemaforAndMutex;

// https://www.youtube.com/watch?v=lHytuX5jbR8

import java.util.concurrent.Semaphore;

public class Sem {

    public static void main(String[] args) {

        // Mutex - mutual exclusion - the same semaphore with 1 in argument-
        //Semaphore table = new Semaphore(1);


        Semaphore table = new Semaphore(3);

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person person6 = new Person();
        Person person7 = new Person();

        person1.table = table;
        person2.table = table;
        person3.table = table;
        person4.table = table;
        person5.table = table;
        person6.table = table;
        person7.table = table;

        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
        person6.start();
        person7.start();

        // as far as there are only 2 tables - new Semaphore(2);
        // it is possible to be eating simultaneously only at 2 tables
        // the rest persons have to wait till some table is released
    }

}

class Person extends Thread {
    Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() +"waiting for table");
        try {
            table.acquire();
            System.out.println(this.getName() +"eat at the table");
            // this.sleep(1000); - the same:
            sleep(1000);
            System.out.println(this.getName() +"release table");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
