package DataStructures;

public class LinkedList {

    private Node head;  // Head of the list which is a node;
    private Node tail;  // Tail of the list
    private int size;   // Size of the list

    public LinkedList(){
        this.size = 0;
    }

    // The structure of a node - has a value and has info of the next node
    private class Node {
        private int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }

    }

       // Function to insert an at first position
       public void insertFirst(int val){
           Node firstNode = new Node(val);  // create a new Node for the element to be inserted;
           firstNode.next = head;    // Point the next node to the current first element "the head";
           head = firstNode;           // Change the head pointer and point it to the newly created node;

           if(tail == null)         // If tail is null, meaning this is the first element of the list;
               tail = head;         // Point tail to head also;

           size++;                  // Update the size of the list;
       }


       public void insertLast(int val){
        Node lastNode = new Node(val);  // Create a new node for the element to be inserted;
        if(tail == null){               // If tail is null, meaning the list is empty;
            insertFirst(val);            // Point head to the new node;
        } else {
            tail.next = lastNode;       // Point the current tail's next to the new node;
            tail = lastNode;            // Update the tail to point to the new node;
            size++;                // Update the size of the list;
        }
       }


       public void insertAtIndex(int val, int index) {
           if(index == 0) {
               insertFirst(val);  // If index is 0, insert at the first position;
           } else if(index == size) {
               insertLast(val);   // If index is equal to size, insert at the last position;
           } else if(index < 0 || index > size) {
               throw new IndexOutOfBoundsException("Index out of bounds");
           } else {
               Node current = head;  // Start from the head;
               for(int i = 0; i < index - 1; i++) { // Traverse to the node just before the index;
                   current = current.next;
               }
               Node newNode = new Node(val, current.next); // Create a new node with next pointing to current's next;
               current.next = newNode; // Point current's next to the new node;
               size++; // Update the size of the list;
           }
       }


       // Function to display the list
       public void displayList(){
           Node temp = head;    // Start from the head of the list;
           while(temp != null){
               System.out.print(temp.value + " -> ");
               temp = temp.next;        // Move to the next node;
           }

           System.out.println("END");
       }




    public static void main(String[] args) {
        LinkedList customLinkedList = new LinkedList();
        customLinkedList.insertFirst(10);
        customLinkedList.insertFirst(20);
        customLinkedList.insertFirst(30);
        customLinkedList.insertFirst(40);
        customLinkedList.insertFirst(50);
        customLinkedList.insertLast(60);
        customLinkedList.insertAtIndex(70, 3); // Insert 70 at index 3
        customLinkedList.displayList();

    }
}
