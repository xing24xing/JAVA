package LinkedList;

public class basic {
    private Node head;

    // Node inner class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print all nodes in the list
    public void printList() {
        Node current = head;
        while (current != null) {
            
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // Move to the next line after printing all nodes
    }
//    public Node reverse(Node head){
//        Node cur = head;
//        Node prev = null;
//        while(cur != null){
//            Node t = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur  = t;
//        }
//        return prev;
//    }
    public Node recursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node newNode = recursive(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newNode;
    }
    // Main method for testing
    public static void main(String[] args) {
        basic list = new basic();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Linked List:");
        list.printList(); // Output: 1 2 3 4
        System.out.println("Reverse");
        list.head = list.recursive(list.head);
        list.printList();
        
    }
}
