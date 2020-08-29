package Arrays;

import java.util.ArrayList;

public class MergeArray {
    public static void mergeArray(int [] first,int [] second){

        ArrayList<Integer> mergedArray= new ArrayList<>();
        //Check for input
        if (first.length==0){
            System.out.println(second);
        }
        else if (second.length==0){
            System.out.println(first);
        }
        int i=0;
        int j=0;
        while (i<=first.length-1||j<=second.length-1){
            if(first[i]<second[j]){
                mergedArray.add(first[i]);
                i++;
            }
            else if (first[i]>second[j]){
                mergedArray.add(second[j]);
                j++;
            }
        }
        System.out.println(mergedArray);
    }
    public static void main(String[] args) {
        mergeArray(new int[]{0,3,4,31},new int[]{2,6,30});
    }
}
