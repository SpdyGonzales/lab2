public class Driver {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addEnd(3);
        list.addEnd(2);
        list.addEnd(2);
        list.addEnd(4);
        list.addEnd(7);
        list.addEnd(1);

        InversionCount invCount = new InversionCount();
        System.out.println(invCount.inversionCounter(list));

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addEnd(3);
        list2.addEnd(2);
        list2.addEnd(2);
        list2.addEnd(4);
        list2.addEnd(7);
        list2.addEnd(1);

        BubbleSort bubbleSorter = new BubbleSort();
        System.out.println(bubbleSorter.bubbleSort(list2));
        list2.printSinglyList();
    }
}
