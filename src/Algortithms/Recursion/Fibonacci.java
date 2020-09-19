package Algortithms.Recursion;

public class Fibonacci {
    public static int fibonacciIterative(int n){
        if (n==1||n==2){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else {
            int first =0;
            int second=1;
            int third=0;
            for(int i=2;i<=n;i++){
                third=first+second;
                //System.out.println(third);
                first=second;
                second=third;
            }
            return third;
        }

    }
    public static int fibonacciRecursive(int n){
        if (n<2){
            return n;
        }
        return fibonacciIterative(n-1)+fibonacciIterative(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(0));
        System.out.println(fibonacciRecursive(1));
        System.out.println(fibonacciRecursive(2));
        System.out.println(fibonacciRecursive(3));
        System.out.println(fibonacciRecursive(4));








    }
}
