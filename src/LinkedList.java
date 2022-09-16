
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public void display() {
        System.out.println(" { " + data + " } ");
    }

}

public class LinkedList {

    private Node head;

    public boolean isEmpty() {
        return (head == null);
    }

}
