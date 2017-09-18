public class InversionCount {

    InversionCount(){}

    private long inversionCount = 0;
    public long inversionCounter(SinglyLinkedList list){
       Node head = list.getFirstNode();

       mergeSort(head);

       return inversionCount;
    }
    public Node mergeSort(Node head){
       if(head == null || head.getNext() == null) { return head; }

       Node center = findCenter(head);
       Node secondHalf = center.getNext(); center.setNext(null);

       return merge(mergeSort(head), mergeSort(secondHalf));

    }

    public Node merge(Node a, Node b){

        Node dummyHead, curr; dummyHead = new Node(); curr = dummyHead;
            while(a !=null && b!= null) {
                if(a.getValue() <= b.getValue()) { curr.setNext(a); a = a.getNext();

                } else { curr.setNext(b); b = b.getNext(); }
                    curr = curr.getNext();
                    inversionCount++;
            }

            if(a == null) { curr.setNext(b);
            }else{ curr.setNext(a);
            }

            return dummyHead.getNext();


    }

    public Node findCenter(Node head){
        if(head.getNext() == null) { return head; }
        Node centerProbe, endProbe; centerProbe = endProbe = head;
        while(endProbe.getNext() != null && endProbe.getNext().getNext() != null)  {
            centerProbe = centerProbe.getNext(); endProbe = endProbe.getNext().getNext();
        }
        return centerProbe;
    }
}
