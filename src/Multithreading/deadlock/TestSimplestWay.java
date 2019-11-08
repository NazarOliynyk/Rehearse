package Multithreading.deadlock;


public class TestSimplestWay {
    String s1 = "S1";
    String s2 = "S2";

    Thread t1 = new Thread(){
        @Override
        public void run() {
            while (true){
                synchronized (s1){
                    System.out.println(Thread.currentThread().getName()+ " locked t1 "+s1);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2){
                        System.out.println(Thread.currentThread().getName()+ " locked t1 WorkingExample"+s2);
                        System.out.println(s1+", "+s2);
                    }
                }
            }
        }
    };
    Thread t2 = new Thread(){
        @Override
        public void run() {
            while (true){
                synchronized (s2){
                    System.out.println(Thread.currentThread().getName()+ " locked t2 "+s2);
                    synchronized (s1){
                        System.out.println(Thread.currentThread().getName()+ " locked t2 WorkingExample"+s1);
                        System.out.println(s1+", "+s2);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        TestSimplestWay obj = new TestSimplestWay();
        obj.t1.start();
        obj.t2.start();
    }
}
