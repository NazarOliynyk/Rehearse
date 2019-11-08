package Recursion.SimpleExamples;

// 5! = 5*4*3*2*1
public class Main3_Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int n){
        if (n == 1) return 1;
        return n* factorial(n-1);
    }
}
