package DataStructures.Stacks.LinkedStack;

public class StackLinkedList {
    @Override
    public String toString() {
        return "StackLinkedList{" +
                "top=" + top +
                ", bottom=" + bottom +
                ", length=" + length +
                '}';
    }

    private StackNode top;
    private StackNode bottom;
    private int length;

    public StackLinkedList (String value){
        StackNode node = new StackNode(value);
        node.setNext(null);
        bottom=node;
        top=bottom;
        length++;

    }
    public void peek(){
        System.out.println(top.getValue());
    }
    public void push (String value){
        // creating new node with value
        StackNode node = new StackNode(value);
        //here our new node goes upword with pointer for backward
        node.setNext(top);
        //making new node as top
        top=node;
        length++;

    }
    public void pop(){
        //checking for stack underflow
        if (length == 1) {
            bottom = null;
        }
        else if (length<1){
            System.out.println("Stack UnderFlow");
            return;
        }
        // storing current top
        StackNode tempTop = top;
        //making below node as top
        top=top.getNext();
        System.out.println("poping item:"+tempTop);
        length--;

    }
    public boolean isEmpty(){
        return length<1;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList("nameer");
        stack.push("sulaiman");
        stack.push("beeran");
        stack.peek();
        stack.pop();
        stack.pop();


        System.out.println(stack.isEmpty());

    }
}
