package Recursion.SimpleExamples;

// 1 1 2 3 5 8 13 21 34
public class Main5_Fibonaci {

    public static void main(String[] args) {
        System.out.println(fibbonaci(9));
        System.out.println("----------------------------");
        for (int i = 1; i < 10; i++) {
            System.out.println(fibbonaci(i));
        }
    }
    private static int fibbonaci(int n){
        if ((n == 1)||(n == 2)) return 1;
        return fibbonaci(n-1)+fibbonaci(n-2);
    }
}
