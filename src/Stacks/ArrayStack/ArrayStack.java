package Stacks.ArrayStack;

import java.util.ArrayList;

public class ArrayStack {
    private ArrayList<String> stack;
    int length;
    public ArrayStack(String value){
        stack=new ArrayList<>();
        stack.add(value);
        length++;
    }
    public void push(String value){
        stack.add(value);
        length++;

    }
    public void pop(){
        // checking for input
        if(length<1){
            System.out.println("stack under Flow");
            return;
        }
        //length-1 holds index for last entry ie,top
        System.out.println("popping element is :"+stack.get(length-1));
        stack.remove(length-1);
        length--;
    }
    public void peek(){
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
