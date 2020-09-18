package DataStructures.Stacks.ArrayStack;

public class StackQueue {
    private ArrayStack stack;
    private ArrayStack auxStack;
    private String first;
    public StackQueue(String value){
        stack=new ArrayStack(value);
        auxStack = new ArrayStack();
    }
    public void enqueue(String value){
            if (stack.isEmpty())
                stack.push(value);
            while (!stack.isEmpty())
                auxStack.push(stack.pop());
            stack.push(value);
            while (!auxStack.isEmpty())
                stack.push(auxStack.pop());
        }

    public void dequeue(){
        stack.pop();
    }
    public void peek(){
        stack.peek();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue("1000");
        queue.enqueue("2000");
        queue.enqueue("3000");
        queue.enqueue("4000");
        queue.peek();
        queue.dequeue();
        queue.enqueue("end");
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.peek();
    }

}
