/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }  
}
public class Insert_Node_After_given_Node {

    public static Node insertAfter(Node head, int key, int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                System.out.println(temp.data+" "+key);
                break;
            }
            temp = temp.next;
        }
        if(temp == null){
            return head;
        }
        Node n = new Node(data);
        n.next = temp.next;
        temp.next = n ;
        return head;
        
    }
    public static void print(Node n){
        while(n != null){
            System.out.print(n.data+" -> ");
            n = n.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
       Node n = new Node(1);
       n.next = new Node(2);
       n.next.next = new  Node(3);
        System.out.println("Original");
        print(n);
        System.out.println("After Inserting");
        int k = 2, d = 5;
        n = insertAfter(n,k,d);
        print(n);
    }
    
}
