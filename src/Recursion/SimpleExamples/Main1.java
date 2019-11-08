package Recursion.SimpleExamples;

public class Main1 {

    public static void main(String[] args) {
        System.out.println(calcSum(1, -1));
    }

    private static int calcSum(int a, int b){
        int sum = a + b;
        if (sum == 0){
            sum = calcSum(1, 1);
        }
        return sum;
    }
}
