public class Node {
    private Node next;
    private int value;


    public Node(){

    }
    public Node(int value, Node next){
        this.value = value;
        this.next = next;

    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }


}
