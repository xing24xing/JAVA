/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;

/**
 *
 * @author khushi pandey
 */
public class FindAndDeleteNthNode {
Node head;
    class Node{
      int data;
      Node next;
      Node(int data){
          this.data = data;
          this.next = null;
      }
    }
//    public void insert(int data){
//        Node n = new Node(data);
//        if(head == null){
//            head = n;
//        }
//        else{
//        n.next = head;
//        head = n;
//        }
//    }
    public void insert(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        Node t = head;
        while(t.next != null){
            t = t.next;
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
    public static void main(String[] args) {
       FindAndDeleteNthNode l = new FindAndDeleteNthNode();
       l.insert(1);
       l.insert(2);
       l.insert(3);
       l.insert(4); 
       l.insert(5);
       l.print();
       
    }
    
}
