package Arrays;

public class ReverseString {
    public static void reverseString(String string){
        if(string==null|string.length()<2|!(string instanceof String)){
            System.out.println("check your input");
            return;
        }
        char [] stringArray=string.toCharArray();
        char [] reverseStringArray= new char[stringArray.length];
        for (int i=stringArray.length-1;i>=0;i--){
            reverseStringArray[stringArray.length-1-i]=stringArray[i];
        }
        System.out.println(reverseStringArray);
    }
    public static void main(String[] args) {
        reverseString("nameer hi you");

    }
}
