package Queues;

public class Queue {
    private QueueNode first;
    private QueueNode last;
    private int length;
    public Queue (String value){
        QueueNode node = new QueueNode(value);
        first=node;
        last=first;
        length++;
    }
    public void push(String value){
        QueueNode node = new QueueNode(value);
        //current lasts next as new node
        last.setNext(node);
        //setting last as new node
        last=node;
        length++;
    }
    public void pop(){
        if(length<1){
            System.out.println("stack underflow");
            return;
        }
        //else
        //temp is used for referencing first node
        QueueNode temp = first;
        first=first.getNext();
        length--;
        System.out.println("poping element is "+temp.getValue());
    }
    public void peek() {
        if (length > 1) {
            System.out.println(first.getValue());
        }
        else System.out.println("no elements");return;
    }
    public boolean isEmpty(){
        return length<1;
    }

    public static void main(String[] args) {
        Queue queue =new Queue("1000");
        queue.push("2000");
        queue.push("3000");
        queue.push("4000");
        queue.peek();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.peek();
        System.out.println(queue.isEmpty());
    }
}
