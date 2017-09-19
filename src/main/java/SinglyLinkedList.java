import java.util.*;

public class SinglyLinkedList {

    private Node  head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addEnd(int value){
        if(head ==null){
            head = new Node(value, null);
            tail = head;
            size++;
        }else{
            Node temp = tail;
            tail = new Node(value,null);
            temp.setNext(tail);
            size++;
        }
    }
    public void swapNodes(Node current, Node next){
        if (current == null || next == null) { throw new NoSuchElementException(); }

        int temp = current.getValue();
        current.setValue(next.getValue());
        next.setValue(temp);
    }

    public int getSize(){

        return size;
    }
    public Node getFirstNode(){

        return head;
    }

    public int getLength(Node a){
        Node temp = a;
        int length = 1;
        while(temp.getNext()!=null){
            length++;
            temp = temp.getNext();
        }
        return length;
    }

    public void printSinglyList() {
        if (head == null) { throw new NoSuchElementException(); }
        Node position = head;
        while (position != null) {
            System.out.print(position.getValue() + " ");
            position = position.getNext();
        }
    }


}