package Multithreading.atomics.first;


public class PlainInt {

    private static int i;

    public static void main(String[] args) throws Exception{
        for (int j = 0; j < 10000; j++) {
            new MyThread().start();
        }
        Thread.sleep(1000);
        // it prints less than 10000
        System.out.println(i);
    }

    private static class MyThread extends Thread{

        @Override
        public void run(){
            i++;
        }
    }
}
