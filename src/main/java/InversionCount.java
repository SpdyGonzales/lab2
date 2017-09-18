public class InversionCount {

    private long inversionCount = 0;

    InversionCount(){}

    public long inversionCounter(SinglyLinkedList list){
       Node head = list.getFirstNode();

       mergeSort(head);

       return inversionCount + 1;
    }
    public Node mergeSort(Node head){
       if(head == null || head.getNext() == null) { return head; }
       Node center = findCenter(head);
       Node secondHalf = center.getNext(); center.setNext(null);

       return merge(mergeSort(head), mergeSort(secondHalf));

    }

    public Node merge(Node a, Node b){

        SinglyLinkedList linkTemplate = new SinglyLinkedList();
        int leftCount = linkTemplate.getLength(a);
        Node dummyHead, curr; dummyHead = new Node(); curr = dummyHead;
            while(a !=null || b!= null) {
                if(a == null){
                    curr.setNext(b);
                    break;
                }
                else if(b == null){
                    curr.setNext(a);
                    break;
                }
               else{
                    if (a.getValue() <= b.getValue()) {
                        curr.setNext(a);
                        a = a.getNext();
                        leftCount--;
                        curr = curr.getNext();
                    } else {
                        curr.setNext(b);
                        b = b.getNext();
                        inversionCount +=leftCount;
                        curr = curr.getNext();
                    }
                }

            }

            return dummyHead.getNext();


    }

    public Node findCenter(Node head){

        if(head.getNext() == null) { return head; }
        Node centerProbe, endProbe, oldCenterProbe, temp; centerProbe = endProbe = oldCenterProbe = temp = head;
        while(endProbe.getNext() != null && endProbe.getNext().getNext() != null)  {
            temp = centerProbe;
            oldCenterProbe = temp;
            centerProbe = centerProbe.getNext();
            endProbe = endProbe.getNext().getNext();

        }
        if(endProbe.getNext() == null){
            return oldCenterProbe;
        }else {
            return centerProbe;
        }

    }
}
