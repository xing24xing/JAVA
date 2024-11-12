/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;

/**
 *
 * @author khushi pandey
 */
public class singleEndedLinkedList {
     Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
//    add first
    public void addFirst(String data){
        Node n = new Node(data);
        if(head == null){
            head  = n;
        }
        else{
        n.next = head;
        head = n;
        }
    }
    public void addLast(String data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        Node t = head;
        while(t.next != null){
            t = t.next ;
        }
        t.next = n;
        
    }
    public void print(){
        Node t = head;
        while(t != null){
            System.out.print(t.data+" -> ");
            t = t.next;
        }
        System.out.println("null");
    }
   public void deleteFirst() {
        if (head == null) {
            return; // List is already empty
        }
        head = head.next; // Move head to the next node
    }
   public void deleteLast(){
       if (head == null) {
            return; // List is already empty
        }
       if(head.next == null){
           head = null;
           return ;
       }
       Node t = head;
       while(t.next.next != null){
           
           t = t.next;
       }
       t.next = null;
   }
    public static void main(String[] args) {
        singleEndedLinkedList l = new singleEndedLinkedList();
//        l.addFirst("This");
//        l.addFirst("is");
//        l.addFirst("a");
//        l.addFirst("LinkedList");
//        l.print();
        l.addLast("This");
        l.addLast("is");
        l.addLast("a");
        l.addLast("LinkedList");
        l.print();
        
        l.deleteFirst();
        l.print();
        l.deleteLast();
        l.print();
        
    }
    
}
