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
        head= new Node();
        //setting head node value
        head.setValue(value);
        //setting next of head node
        head.setNext(null);
        //setting tail as head since it is the first node of the linked list
        tail =head;


    }
    public void append(int value){
        tail.setNext(new Node());
        tail.setNextValue(value);
        tail.setNextNext(null);
        tail=tail.getNext();
    }

    public static void main(String[] args) {
        LinkedListImplementation linkedList = new LinkedListImplementation(5);
        linkedList.append(10);
        linkedList.append(16);
        System.out.println(linkedList);
    }
}
