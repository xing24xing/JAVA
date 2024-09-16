/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;

/**
 *
 * @author khushi pandey
 */
public class Detect_Cycle {
     private Node head;
   private static class Node{
      int data;
      Node next;
      Node(int data){
          this.data = data;
          this.next = null;
      }
   }
   public void insert(int data){
       Node newNode = new Node(data);
       if(head == null){
           head = newNode;
       }
       else{
       Node cur = head;
       while(cur.next != null){
           cur = cur.next;
       }
       cur.next = newNode;
       }
       
   }
   
   public Node first(Node head){
       Node m = detect(head);
       Node start = head;
       while(head != m){
           start = start.next;
           m = m.next;
       }
       return start;
   }
   public void print(){
       Node t = head;
       while(t != null){
           System.out.print(t.data+" -> ");
           t = t.next;
       }
       System.out.println("null");
   }
    public Node detect(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Detect_Cycle d = new Detect_Cycle();
        d.insert(2);
        d.insert(4);
        d.insert(5);
        d.insert(6);
        d.insert(2);
        d.print();
        System.out.println(d.detect(d.head));
        d.print();
    }
    
}
