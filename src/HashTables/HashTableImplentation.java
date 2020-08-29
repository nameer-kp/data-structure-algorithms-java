package HashTables;

public class HashTableImplentation {
    static int[] a = new int[50];
    static public void setHashMethod(HashTable obj){
        int index= hashFun(obj.key);
        a[index]= obj.value;
    }
    static public void getHashMethod(String key){
        int index= hashFun(key);
        System.out.println("From get Method :"+a[index]);
    }

    static public int hashFun(String key){
        return (key.length()*2)%50;
    }
    public static void main(String[] args) {
        HashTable element = new HashTable("grape",1000);
        HashTable element2 = new HashTable("orange",2000);
        setHashMethod(element);
        setHashMethod(element2);
        getHashMethod("orange");
    }
}
class HashTable{
    String key;
    int value;
    public HashTable(String key,int value){
        this.key=key;
        this.value=value;
    }
}
