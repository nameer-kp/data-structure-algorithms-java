package DataStructures.LinkedList;

import java.util.ArrayList;

public class SinglyLinkedListImplementation {
    private SinglyNode head;
    private SinglyNode tail;
    private int length;

    public int getLength() {
        return length;
    }

    public SinglyLinkedListImplementation(int value){
        head= new SinglyNode(value);//setting head node value

        // setting next of head node

        head.setNext(null);
        //setting tail as head since it is the first node of the linked list
        tail =head;
        length++;


    }
    public void append(int value){
        SinglyNode newSinglyNode =new SinglyNode(value);
        newSinglyNode.setNext(null);
        tail.setNext(newSinglyNode);
        tail= newSinglyNode;
        length++;
    }
    public void prepend(int value){
        //creating a new node;   //setting its value
        SinglyNode newSinglyNode =new SinglyNode(value);
        newSinglyNode.setNext(head);
        //setting head as new node
        head= newSinglyNode;
        length++;
    }
    //this method is for implementing simplified print
    public void printList(){
        ArrayList<Integer> list=new ArrayList<>();
        SinglyNode currentSinglyNode = head;
        while (currentSinglyNode !=null){
            list.add(currentSinglyNode.getValue());
            currentSinglyNode = currentSinglyNode.getNext();
        }
        System.out.println(list);
    }

    public void insert(int index,int value){
        if(index ==0){
            prepend(value);
            return;
        }
        //checking input
        if (index>length||index<0){
            System.out.println("you cant add to the given index..");
            return;
        }
        SinglyNode newSinglyNode =new SinglyNode(value);
        //creating node reference for currentNode
        SinglyNode currentSinglyNode = traverseToIndex(index);
        //inserting new node by changing setNext values of currentNode.next and newNode.next
        newSinglyNode.setNext(currentSinglyNode.getNext());
        currentSinglyNode.setNext(newSinglyNode);
        length++;
    }
    public void remove(int index){
        //for index zero
        if (index==0){
            head=head.getNext();
            return;
        }
        if (index>=length||index<0){
            System.out.println("sorry we cant remove..check your index");
            return;
        }
        SinglyNode currentSinglyNode = traverseToIndex(index);
        //setting currentNodes next as the next of the node to be removed
        currentSinglyNode.setNext(currentSinglyNode.getNext().getNext());
        length--;

    }
    public SinglyNode traverseToIndex(int index){
        //this method is used to get the node before index
        SinglyNode currentSinglyNode = head;
        for (int i=1;i<index;i++){
            currentSinglyNode = currentSinglyNode.getNext();
        }
        return currentSinglyNode;
    }
//    public SinglyNode elementBeforetail(){
//        SinglyNode currentSinglyNode=head;
//        while((currentSinglyNode.getNext().getNext())!=null){
//            currentSinglyNode=currentSinglyNode.getNext();
//        }
//        return currentSinglyNode;
//    }


    public SinglyLinkedListImplementation reverse(){

        //assigning current value as head
        SinglyNode currentSinglyNode=head;
        //setting current value as first node
        SinglyLinkedListImplementation reversedLinkedList= new SinglyLinkedListImplementation(currentSinglyNode.getValue());
        //loop untill last node
        while((currentSinglyNode.getNext())!=null){
            currentSinglyNode=currentSinglyNode.getNext();
            //by using prepend we can move older nodes to right
            reversedLinkedList.prepend(currentSinglyNode.getValue());
        }
       return reversedLinkedList;
    }
    public void reverse2(){
        SinglyNode first=head;
        SinglyNode second=head.getNext();
        SinglyNode temp;
        tail=first;
        while (second!=null){
            temp =second.getNext();
            second.setNext(first);
            first=second;
            second=temp;
        }
        head.setNext(null);
        head=first;

    }

    @Override
    public String toString() {
        return "SinglyLinkedListImplementation{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        SinglyLinkedListImplementation linkedList = new SinglyLinkedListImplementation(5);
        linkedList.append(10);
        linkedList.append(16);
        linkedList.append(4);
        System.out.println(linkedList.getLength());
        linkedList.insert(2,99);
        linkedList.printList();
        linkedList.reverse2();
        linkedList.printList();
    }
}
