package Queues;

public class QueueNode {
    private String value;
    private QueueNode next;

    @Override
    public String toString() {
        return "StackNode{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }

    public QueueNode(String value){
        this.value=value;
        this.setNext(null);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
