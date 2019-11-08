package Multithreading.tutorial.volatileVar;


public class MyVolatile {

    // makes thread to not cash the value of i
    private static volatile int i;
    // private static  int i;

    public static void main(String[] args) {
        new MyThreadWrite().start();
        new MyThreadRead().start();
    }

    private static class MyThreadWrite extends Thread{
        @Override
        public void run() {
        while (i<5){
            System.out.println("incremented i: "+(++i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }

    private static class MyThreadRead extends Thread{
        @Override
        public void run() {
            int localVar = i;
            while (localVar <5){
                if(localVar!=i){
                    System.out.println("new value of i: "+i);
                    localVar = i;
                }
            }
        }
    }
}
