package HowToSolveProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CheckSimilarInArrays {
    static private boolean similar(char [] a,char [] b){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if (a[i]==b[j])return true;
            }
        }
        return false;
    }
    static private boolean similar2(char [] a,char [] b){
        HashSet<Character> map =new HashSet<Character>();

        for (int i=0;i<a.length;i++){
            map.add(a[i]);
        }
        for (int i=0;i<b.length;i++){
            if (map.contains(b[i])){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(similar2(new char[]{'b','a','c','d'},new char[]{'a','g','r'}));
    }
}
