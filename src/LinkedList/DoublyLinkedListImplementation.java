package LinkedList;

import java.util.ArrayList;

public class DoublyLinkedListImplementation {
    private DoublyNode head;
    private DoublyNode tail;
    private int length;

    public int getLength() {
        return length;
    }

    public DoublyLinkedListImplementation(int value){
        head= new DoublyNode(value);//setting head node value

        // setting next of head node

        head.setNext(null);

        //setting previous as null
        head.setPrevious(null);
        //setting tail as head since it is the first node of the linked list
        tail =head;
        length++;


    }
    public void append(int value){
        DoublyNode doublyNode= new DoublyNode(value);
        doublyNode.setPrevious(tail);
        doublyNode.setNext(null);
        tail.setNext(doublyNode);
        tail=doublyNode;
        length++;

    }
    public void prepend(int value){
        //creating a new node;   //setting its value
        DoublyNode newDoublyNode =new DoublyNode(value);
        newDoublyNode.setNext(head);
        //setting previous of new node as null
        newDoublyNode.setPrevious(null);
        //setting current heads previous as newnode
        head.setPrevious(newDoublyNode);
        //setting head as new node
        head= newDoublyNode;
        length++;
    }
    public void insert(int index,int value){
        if(index ==0){
            prepend(value);
            return;
        }
        else if(index==length){
            append(value);
            return;
        }
        //checking input
        if (index>length||index<0){
            System.out.println("you cant add to the given index..");
            return;
        }
        DoublyNode newDoublyNode =new DoublyNode(value);
        //creating node reference for currentNode
        DoublyNode currentDoublyNode = traverseToIndex(index);
        //inserting new node by changing setNext values of currentNode.next and newNode.next
        newDoublyNode.setNext(currentDoublyNode.getNext());
        //setting set previous of currentnode's next node as newNode
        currentDoublyNode.getNext().setPrevious(newDoublyNode);
        //setting newnode's previous as currentNode
        newDoublyNode.setPrevious(currentDoublyNode);
        //setting current nodes next as newNode
        currentDoublyNode.setNext(newDoublyNode);
        length++;
    }

    public void remove(int index) {
        //for index zero
        if (index == 0) {
            head = head.getNext();
            //setting previous of new head as null
            head.setPrevious(null);
            length--;
            return;
        }
        else if(index==length-1){
            DoublyNode currentDoublyNode = traverseToIndex(index);
            //removing next pointer of currentnode
            currentDoublyNode.setNext(null);
            tail=currentDoublyNode;
            length--;
            return;
        }
        if (index >= length || index < 0) {
            System.out.println("sorry we cant remove..check your index");
            return;
        }
        DoublyNode currentDoublyNode = traverseToIndex(index);
        //setting previous of currentNode's next next node as current node
        currentDoublyNode.getNext().getNext().setPrevious(currentDoublyNode);
        //setting currentNodes next as the next of the node to be removed
        currentDoublyNode.setNext(currentDoublyNode.getNext().getNext());

        length--;
    }
    public DoublyNode traverseToIndex(int index){
        //this method is used to get the node before index
        DoublyNode currentDoublyNode = head;
        for (int i=1;i<index;i++){
            currentDoublyNode = currentDoublyNode.getNext();
        }
        return currentDoublyNode;
    }
    public void printList(){
        ArrayList<Integer> list=new ArrayList<>();
        DoublyNode currentDoublyNode = head;
        while (currentDoublyNode !=null){
            list.add(currentDoublyNode.getValue());
            currentDoublyNode = currentDoublyNode.getNext();
        }
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "DoublyLinkedListImplementation{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        DoublyLinkedListImplementation doublyLinkedListImplementation = new DoublyLinkedListImplementation(10);
        doublyLinkedListImplementation.append(5);
        doublyLinkedListImplementation.append(50);
        doublyLinkedListImplementation.prepend(1);
        doublyLinkedListImplementation.insert(4,55);
        System.out.println(doublyLinkedListImplementation);
        doublyLinkedListImplementation.remove(4);
        doublyLinkedListImplementation.printList();
    }
}
