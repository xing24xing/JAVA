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
public class Insert_Node_At_Specific_Postition {
    public static Node insert(Node head,int pos,int data){
        Node n = new Node(data);
        if(pos == 1){
            n.next = head;
            head = n;
            return head;
    }
       Node t = head;
       for(int i = 1;i < pos - 1 && t != null;i++)
       {
           t = t.next;
       }
       if(t == null){
           System.out.println("Position Is Out Of The Bound");
           return head;
       }
       n.next = t.next;
       t.next = n;
       return head;
    
}
    public static void print(Node h){
        while(h != null){
            System.out.print(h.data+" -> ");
            h = h.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Node n = new Node(4);
        n.next = new Node(5);
        n.next.next = new Node(6);
        System.out.println("Original");
        print(n);
        System.out.println("After Insertion");
        int p = 3,val = 12;
        n = insert(n,p,val);
        print(n);
        
    }
    
}
