/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;


public class Palindrome {
  private Node head;
  private static class Node{
    
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next = null;
    }
}
    public Node insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node t = head;
            while(t.next != null){
                t = t.next;
            }
           t.next = newNode;
        }
         return newNode;
    }
    public void print(){
        Node t = head;
        while(t != null){
            System.out.print(t.data+" -> ");
            t = t.next;
        }
        System.out.println("null");
    }
    public Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        while(cur!=null){
            Node t = cur.next;
            cur.next = prev;
            prev = cur;
            cur = t;
        }
        return prev;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.insert(1);
        p.insert(2);
        p.insert(3);
        p.insert(4);
        p.insert(5);
        p.print();
        p.head = p.reverse(p.head);
        p.print();
    }
    
}
