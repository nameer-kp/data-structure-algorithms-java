package Stacks.LinkedStack;

public class StackNode {
    private String value;
    private StackNode next;

    @Override
    public String toString() {
        return "StackNode{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }

    public StackNode(String value){
        this.value=value;
        this.setNext(null);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }
}
