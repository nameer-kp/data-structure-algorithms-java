package Algortithms.Recursion;

public class Factorial {
    public static int factorialWithRecursion(int a){
        if(a==1){
            return 1;
        }
        return a*factorialWithRecursion(a-1);
    }
    public static int factorialWithIteration(int n){
        int product =1;
        for (int i=1;i<=n;i++){
            product=product*i;
        }

        return product;
    }
    public static void main(String[] args) {

        double time=System.nanoTime();
        System.out.println("time taken in Recursion :"+(System.nanoTime()-time));
        System.out.println(factorialWithRecursion(5));
        System.out.println(factorialWithIteration(5));
        System.out.println("time taken in iteration :"+(System.nanoTime()-time));

    }
}
