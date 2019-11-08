package Multithreading.syncronized.syncriniz;

public class Waiter extends Thread{

    private Cup cup;

    public Waiter(Cup cup){
        this.cup = cup;
    }
    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            cup.pour();
        }
    }
}
