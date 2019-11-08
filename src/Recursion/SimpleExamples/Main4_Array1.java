package Recursion.SimpleExamples;

public class Main4_Array1 {

    public static void main(String[] args) {
        A a = new A(10);
        a.print(10);
    }
}

class A {
    private int [] mas;

    public A(int n) {
        mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random()*100);
        }
    }

    public void print(int n){
        if (n == 0) return;
        System.out.print(mas[n-1]+ " ");
        print(n-1);
    }
}

