package DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
//        LinkedList customLinkedList = new LinkedList();
//        customLinkedList.insertLast(10);
//        customLinkedList.insertLast(20);
//        customLinkedList.insertLast(20);
//        customLinkedList.insertLast(20);
//        customLinkedList.insertLast(40);
//        customLinkedList.insertLast(40);
//        customLinkedList.insertLast(60);
//        customLinkedList.insertAtIndex(70, 3); // Insert 70 at index 3
//        customLinkedList.displayList();
//        customLinkedList.removeDuplicates();
//        customLinkedList.displayList();

        LinkedList customLL = new LinkedList();
        customLL.insertLast(1);
        customLL.insertLast(2);
        customLL.insertLast(5);

        LinkedList customLL2 = new LinkedList();
        customLL2.insertLast(1);
        customLL2.insertLast(3);
        customLL2.insertLast(9);

        LinkedList newLL = LinkedList.mergeSortedLLs(customLL, customLL2);
        newLL.displayList();
    }
}
