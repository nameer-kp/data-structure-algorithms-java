package Stacks.ArrayStack;

public class StackQueue {
    private ArrayStack stack;
    private ArrayStack reverseStack;
    private String first;
    public StackQueue(String value){
        stack=new ArrayStack(value);
    }
    public void enqueue(String value){
        stack.push(value);
    }
    public void reversing(){
        reverseStack = new ArrayStack();
        while (!stack.isEmpty()){

            //reverseStack contains elements of stack in reverse order
            reverseStack.push(stack.pop());
        }

    }
    public void dequeue(){
        reverseStack.pop();
    }
    public void peek(){
        reverseStack.peek();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue("1000");
        queue.enqueue("2000");
        queue.enqueue("3000");
        queue.enqueue("4000");
        queue.reversing();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
    }

}
