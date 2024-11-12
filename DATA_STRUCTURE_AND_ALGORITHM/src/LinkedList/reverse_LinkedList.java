/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;

/**
 *
 * @author khushi pandey
 */
public class reverse_LinkedList {
    Node  head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public void insert(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
    public void print(){
        Node t = head;
        while(t != null){
            System.out.print(t.data+" -> ");
            t = t.next;
        }
        System.out.println("null");
    }
//        public void reverse(){
//            if(head == null || head.next == null){
//                return;
//            }
//            Node prev = head;
//            Node cur = head.next;
//            while(cur != null){
//                Node n = cur.next;
//                cur.next = prev;
//                prev = cur;
//                cur = n;
//            }
//            head.next = null;
//            head = prev;
//        }
    public Node reverseRecurse(Node head){
        if(head == null || head.next == null){
            return head;
        }
       Node t = reverseRecurse(head.next);
       head.next.next = head;
       head.next = null;
       return t;
        
        
    }
    public static void main(String[] args) {
        reverse_LinkedList l = new reverse_LinkedList();
        l.insert(4);
        l.insert(3);
        l.insert(2);
        l.insert(1);
        l.print();
//        l.reverse();
        l.print();
       l.head = l.reverseRecurse(l.head);
        l.print();
    }
    
}
