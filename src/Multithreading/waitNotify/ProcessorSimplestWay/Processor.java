package Multithreading.waitNotify.ProcessorSimplestWay;

import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException{
        synchronized (this){
            System.out.println("produce thread waiting ...");
            wait();
            System.out.println("resumed");
        }
    }

    public void consume() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this){
            System.out.println("waiting for return key..");
            scanner.nextLine();
            System.out.println("return key pressed");
            notify();
        }
    }
}
