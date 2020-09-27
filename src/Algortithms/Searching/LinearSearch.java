package Algortithms.Searching;

public class LinearSearch {
    public static void linearSearch(int [] array,int key){
        for(int i=0;i<array.length;i++){
            if(key==array[i]){
                System.out.println("item found at index:"+i);
            }
        }
    }

    public static void main(String[] args) {
        linearSearch(new int[]{3,4,2,10,5,8,6},5);
    }
}
