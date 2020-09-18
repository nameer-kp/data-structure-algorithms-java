package DataStructures.HashTables;

import java.util.HashSet;

public class RecurringCharacter {
    public static void recurringCheck(int [] array){
        //this set is used for storing selected array items
        HashSet<Integer> set =new HashSet<>();
        for (int i=0;i< array.length;i++){
            if (set.isEmpty()){
                set.add(array[i]);
            }
            else if (set.contains(array[i])){
                System.out.println("first recurring item is :"+array[i]);
                break;
            }
            set.add(array[i]);
        }
        System.out.println("no recurring items");
    }
    public static void main(String[] args) {
        recurringCheck(new int[]{2,4,1,3,6,8,5});
    }
}
