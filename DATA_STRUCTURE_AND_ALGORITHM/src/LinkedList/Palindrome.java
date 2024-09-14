package LinkedList;

public class Palindrome {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert nodes into the linked list
    public Node insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = newNode;
        }
        return newNode;
    }

    // Method to print the linked list
    public void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    // Method to find the middle node of the linked list
    public Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Method to reverse the linked list
    public Node reverse(Node head) {
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node t = cur.next;
            cur.next = prev;
            prev = cur;
            cur = t;
        }
        return prev;
    }

    // Method to check if the linked list is a palindrome
    public boolean palin(Node head) {
        if (head == null || head.next == null) return true;

        // Find the middle node
        Node mid = middle(head);

        // Reverse the second half of the list
        Node secondHalf = reverse(mid.next);

        // Set the end of the first half to null
        mid.next = null;

        // Compare the first and second halves
        Node firstHalf = head;
        Node secondHalfCopy = secondHalf; // Preserve the reversed list for potential future use

        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Restore the original list (optional)
        reverse(secondHalfCopy);

        return true;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.insert(1);
        p.insert(2);
        p.insert(2);
        p.insert(2);
        p.insert(1);
        p.print();

        System.out.println("Is palindrome? " + p.palin(p.head));
    }
}
