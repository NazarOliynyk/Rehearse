package Recursion.SimpleExamples;

public class Main2 {

    public static void main(String[] args) {
        counter(5);
    }
    private static void counter(int n){
        System.out.println(n);
        if (n == 0){
            return;
        }
        counter(n-1);
    }
}
