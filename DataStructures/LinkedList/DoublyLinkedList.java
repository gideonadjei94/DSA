package DataStructures.LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void displayList(){
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }


    public static void main(String[] args) {
        DoublyLinkedList customDll = new DoublyLinkedList();
        customDll.insertFirst(10);
        customDll.insertFirst(20);
        customDll.insertFirst(30);
        customDll.insertFirst(40);
        customDll.insertFirst(50);
        customDll.displayList(); // Output: 50 -> 40 -> 30 -> 20 -> 10 -> END
    }
}
