package Multithreading.volatileVars.secondVolatileVsSyncro;

public class MyThread extends Thread{

    //private boolean valid = true;
    private volatile boolean valid = true;
    @Override
    public void run() {
        while (valid){
            System.out.println("The execution is going on");
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stopExecution(){
        valid = false;
    }
}
