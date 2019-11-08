package Multithreading.volatileVars.secondVolatileVsSyncro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        t1.stopExecution();;
    }
}
