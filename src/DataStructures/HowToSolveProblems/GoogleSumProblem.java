package DataStructures.HowToSolveProblems;

import java.util.HashSet;

public class GoogleSumProblem {
    public static boolean arraysSum(int [] a,int sum){
        int low =0;
        int high =a.length-1;
        while (low<high){
            int s =a[low]+a[high];
            if(s==sum){
                return true;
            }
            else if(s<sum){
                low++;
            }
            else high--;
        }
        return false;
    }
    public static boolean arraysSum2(int []a,int sum){
        HashSet<Integer> complimentSet= new HashSet<>();
        for(int i=0;i<a.length;i++){
            if (!complimentSet.isEmpty()){
                if(complimentSet.contains(a[i])){
                    return true;
                }
            }
            complimentSet.add(sum-a[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] a={9,4,3,3,1,2,3};
        System.out.println(arraysSum2(a,8));
    }
}
