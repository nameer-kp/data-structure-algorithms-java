package LinkedList;

public class LinkedListImplementation {
    private Node head;
    private Node tail;

    @Override
    public String toString() {
        return "LinkedListImplementation{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public LinkedListImplementation(int value){
        head= new Node(value);//setting head node value 

        // setting next of head node

        head.setNext(null);
        //setting tail as head since it is the first node of the linked list
        tail =head;


    }
    public void append(int value){
        Node newNode=new Node(value);
        newNode.setNext(null);
        tail.setNext(newNode);
        tail=newNode;
    }
    public void prepend(int value){
        //creating a new node;   //setting its value
        Node newNode=new Node(value);
        newNode.setNext(head);
        //setting head as new node
        head=newNode;
    }

    public static void main(String[] args) {
        LinkedListImplementation linkedList = new LinkedListImplementation(5);
        linkedList.append(10);
        linkedList.append(16);
        linkedList.prepend(1);
        System.out.println(linkedList);
    }
}