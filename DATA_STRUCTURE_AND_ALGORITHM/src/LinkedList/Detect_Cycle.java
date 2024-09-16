package LinkedList;

public class Detect_Cycle {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
    }

    // Helper method to create a cycle for testing
    public void createCycle() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // Creating a cycle by connecting the last node to the second node
        temp.next = head.next; // This creates a cycle for testing
    }

    // Method to detect and remove the cycle
    public void detectAndRemoveCycle(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect if a cycle exists
        boolean cycleExists = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }

        // If no cycle exists, return
        if (!cycleExists) {
            System.out.println("No cycle detected.");
            return;
        }

        // Step 2: Find the starting node of the cycle
        slow = head;
        Node prev = null;  // To keep track of the previous node of the fast pointer
        while (slow != fast) {
            prev = fast;  // Track the node before the fast pointer
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove the cycle by setting the `next` of the previous node to `null`
        prev.next = null;

        System.out.println("Cycle detected and removed.");
    }

    // Print the linked list
    public void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Detect_Cycle d = new Detect_Cycle();
        d.insert(2);
        d.insert(4);
        d.insert(5);
        d.insert(6);
        d.insert(7);

        // Create a cycle in the linked list for testing
        d.createCycle();

        // Detect and remove the cycle
        d.detectAndRemoveCycle(d.head);

        // Print the linked list after removing the cycle
        d.print();
    }
}
