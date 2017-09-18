public class BubbleSort {

    public long bubbleSort(SinglyLinkedList list){
        int r = (list.getSize()-1);
        int swapCount = 0;
        boolean swapped = true;

        while(r >= 0 && swapped){

            swapped = false;
            Node currentNode = list.getFirstNode();
            for(int i=0;i<r;i++){

                if(currentNode.getValue() > currentNode.getNext().getValue()){
                    swapped = true;
                    swapCount++;
                    list.swapNodes(currentNode, currentNode.getNext());
                }
                currentNode = currentNode.getNext();
             }
             r = r-1;

        }
        return swapCount;
    }

}
