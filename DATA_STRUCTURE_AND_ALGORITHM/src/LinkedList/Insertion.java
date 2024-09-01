/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;
class Node{
    
      int data;
      Node next;
      Node(int d){
          this.data = d;
          this.next = null;
      }
  }
public class Insertion {
      //Function to insert at new node in the begining of the list
      public static Node insertAtFront(Node head,int d){
          //Create a new Node With the Given data
          Node n = new Node(d);
          //Make the next of node with node point to current head;
          n.next = head;
          //Return the new Node as new head of the list
          return n;
          
      }
      public static void print(Node head){
          Node curr = head;
          while (curr != null){
              System.out.print(curr.data+" -> ");
              curr = curr.next;
          }
          System.out.println("null");
      }
  
    public static void main(String[] args) {
       Node n = new Node(1);
       n.next = new Node(2);
       n.next.next = new Node(3);
        System.out.println("My Original Linked List");
        print(n);
        System.out.println("After Insetion At Front");
        int d = 5;
        n = insertAtFront(n,d);
        print(n);
        
       
       
    }
    
}
