package DataStructures.HashTables;

import java.util.ArrayList;

public class HashTableImplentation {
    ArrayList<KeyValue> [] buckets;
    int bucketLength;
    public HashTableImplentation (int size){
        buckets =new ArrayList [size] ;
    }
    public void setHashMethod(KeyValue pair){
        int bucketIndex=hashFun(pair.key);
        if(buckets[bucketIndex]==null){
            buckets[bucketIndex]=new ArrayList<KeyValue>();
            bucketLength++;

        }
        buckets[bucketIndex].add(pair);


    }

    public void getHashMethod(String key) {
        int bucketIndex = hashFun(key);
        if (buckets[bucketIndex] == null) {
            System.out.println("no values present with the key: " + key);
            return;
        }
        ArrayList<KeyValue> bucket = buckets[bucketIndex];
        for (KeyValue pair : bucket
        ) {
            if (pair.key.equals(key)) {
                System.out.println("item is :" + pair);
            }
        }
    }
        public void getKeys(){
            for(int i=0;i<bucketLength;i++)
            {
                for (KeyValue pair:buckets[i]
                     ) {
                    System.out.println("key: "+pair.key);
                }
            }
        }


    public int hashFun(String key){
        return (key.length()*2)%buckets.length;
    }
    public static void main(String[] args) {
        HashTableImplentation hashTable=new HashTableImplentation(3);
        KeyValue element = new KeyValue("grape",1000);
        KeyValue element2 = new KeyValue("orange",2000);
        KeyValue element3 = new KeyValue("appless",4000);
        KeyValue element4 = new KeyValue("banana",4000);
        hashTable.setHashMethod(element);
        hashTable.setHashMethod(element2);
        hashTable.setHashMethod(element3);
        hashTable.setHashMethod(element4);
        hashTable.getHashMethod("grape");
        hashTable.getHashMethod("orange");
        hashTable.getHashMethod("appless");
        hashTable.getHashMethod("banana");
        hashTable.getKeys();
//        hashTable.getHashMethod("banana");
    }
}
class KeyValue{
    String key;
    int value;
    public KeyValue(String key,int value){
        this.key=key;
        this.value=value;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
