package Algortithms.DynamicProgramming;

import java.util.HashMap;

public class Fibonacci {
    static int count;
    static HashMap<Integer,Integer> cache = new HashMap<>();
    public static int fibonacci(int n){

        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int fibonacciMaster(int n){

        if (cache.containsKey(n)){
            return cache.get(n);
        }
        else{
            count++;
            if(n<2){
                return n;
            }
            cache.put(n,fibonacciMaster(n-1)+fibonacciMaster(n-2));
            return cache.get(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacciMaster(10));
        System.out.println(count);
    }
}
