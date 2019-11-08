package Multithreading.syncronized;


public class Homeostasis {

    private static  int balance =0;

    public static void main(String[] args) {
        Homeostasis h = new Homeostasis();
        h.goingThroughLife();
    }

    public void goingThroughLife(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                     add();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    subtract();
                }
            }
        });
        t1.start();
        t2.start();

        // works without this joins:

//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Ballance: "+balance);
    }

    // if there is not synchronized - the output is not 0 all the times
    // making variable balance volatile does not solve the problem

    private  void add(){
        balance++;
    }
    private  void subtract(){
        balance--;
    }
//    private synchronized void add(){
//        balance++;
//    }
//    private synchronized void subtract(){
//        balance--;
//    }
}
