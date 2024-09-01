/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;


public class LinkedList {
    Node head;
  class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
    }
}
  boolean areidentical(LinkedList list){
      Node a = this.head , b = list.head;
      while(a != null && b != null){
          if(a.data != b.data){
              return false;
          }
          a = a.next;
          b = b.next;
      }
      return true;
  }
  void push (int new_data){
      Node new_node = new Node(new_data);
      new_node.next = head;
      head = new_node;
  }
    public static void main(String[] args) {
       LinkedList l1 = new LinkedList();
       LinkedList l2 = new LinkedList();
       l1.push(1);
       l1.push(2);
       l1.push(3);
       l2.push(1);
       l2.push(2);
       l2.push(3);
       if(l1.areidentical(l2) == true){
           System.out.println("Identical");
       }else{
           System.out.println("Not Identical");
       }
    }
    
}
