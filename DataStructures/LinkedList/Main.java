package DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList customLL = new LinkedList();
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertLast(10);
        customLinkedList.insertLast(20);
        customLinkedList.insertLast(20);
        customLinkedList.insertLast(20);
        customLinkedList.insertLast(40);
        customLinkedList.insertLast(40);
        customLinkedList.insertLast(60);
//        customLinkedList.insertAtIndex(70, 3); // Insert 70 at index 3
        customLinkedList.displayList();
        customLinkedList.removeDuplicates();
        customLinkedList.displayList();
    }
}
