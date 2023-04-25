package edu.kis.vh.nursery.list;

public class Node {

    private final int VALUE;
    private Node prev;
    private Node next;

    public Node(int i) {
        VALUE = i;
    }

    public int getVALUE() {
        return VALUE;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
