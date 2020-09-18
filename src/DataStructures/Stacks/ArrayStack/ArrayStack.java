package DataStructures.Stacks.ArrayStack;

import java.util.ArrayList;

public class ArrayStack {
    private ArrayList<String> stack;
    int length;
    public ArrayStack(){
        stack=new ArrayList<>();
    }
    public ArrayStack(String value){
        stack=new ArrayList<>();
        stack.add(value);
        length++;
    }
    public void push(String value){
        stack.add(value);
        length++;

    }
    public String pop(){
        // checking for input
        if(length<1){
            System.out.println("stack under Flow");
            return null;
        }
        //length-1 holds index for last entry ie,top
        String current =stack.get(length-1);
        System.out.println("popping element is :"+current);
        stack.remove(length-1);
        length--;
        return current;
    }
    public void peek(){
        if(length<1){ System.out.println("no element");return;}
        System.out.println(stack.get(length-1));
    }
    public boolean isEmpty(){
        return length<1;
    }

    public static void main(String[] args) {
        ArrayStack stack =new ArrayStack("1000");
        stack.push("2000");
        stack.push("3000");
        stack.push("4000");
        stack.push("5000");
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());

    }
}
