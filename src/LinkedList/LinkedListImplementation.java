package LinkedList;

import java.util.ArrayList;

public class LinkedListImplementation {
    private Node head;
    private Node tail;
    private int length;

    public int getLength() {
        return length;
    }

    public LinkedListImplementation(int value){
        head= new Node(value);//setting head node value

        // setting next of head node

        head.setNext(null);
        //setting tail as head since it is the first node of the linked list
        tail =head;
        length++;


    }
    public void append(int value){
        Node newNode=new Node(value);
        newNode.setNext(null);
        tail.setNext(newNode);
        tail=newNode;
        length++;
    }
    public void prepend(int value){
        //creating a new node;   //setting its value
        Node newNode=new Node(value);
        newNode.setNext(head);
        //setting head as new node
        head=newNode;
        length++;
    }
    //this method is for implementing simplified print
    public void printList(){
        ArrayList<Integer> list=new ArrayList<>();
        Node currentNode = head;
        while (currentNode!=null){
            list.add(currentNode.getValue());
            currentNode=currentNode.getNext();
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
        Node newNode=new Node(value);
        //creating node reference for currentNode
        Node currentNode =head;
        for (int i =1;i<index;i++){
          currentNode=currentNode.getNext();
        }
        //inserting new node by changing setNext values of currentNode.next and newNode.next
        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
        length++;
    }



    public static void main(String[] args) {
        LinkedListImplementation linkedList = new LinkedListImplementation(5);
        linkedList.append(10);
        linkedList.append(16);
        linkedList.append(4);
        System.out.println(linkedList.getLength());
        linkedList.insert(5,99);
        linkedList.printList();
    }
}
