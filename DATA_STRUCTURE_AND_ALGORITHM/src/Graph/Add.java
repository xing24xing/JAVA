/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Graph;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Add {
//    public  static Node Insert(Node h,int d){
//        Node n = new Node(d);
//        n.next = h;
//        return n;
//            
//            
//    }
    public static Node Insert(Node h,int d){
        Node n = new Node(d);
        n.next = h;
        return n;   
    }
//    public  static Node Back(Node h,int d){
////        Node n = new Node(d);
//        if(h == null) 
//            h = d;
//           
//         Node t = h;
//         while(t.next != null)
//         { 
//             t = d;
//             t = t.next;  
//         }
////            t.next = n;
//           return n;
//         }
    public static Node Back(Node h, int d) {
        Node n = new Node(d);
        if (h == null) {
            return n; // If the list is empty, the new node becomes the head
        }

        Node t = h;
        while (t.next != null) {
            t = t.next; // Traverse to the end of the list
        }
        t.next = n; // Add the new node at the end
        return h;
    }

       public static int len(Node n){
           if(n == null) System.out.println("Linked List Is Empty");
           Node t = n;
           int c = 0;
           while(t != null){
               c += 1;
               t = t.next;
           }
//           System.out.println("Total Length : "+c);
return c;
       }
        
    
    
    public static void print(Node n){
        Node t = n;
        while(t != null){
            System.out.print(t.data+" -> ");
            t = t.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
       Node n = new Node(1);
       n.next = new Node(2);
       n.next.next = new Node(3);
       n.next.next.next = new Node(8 );
       print(n);
        System.out.println("Total Length : "+len(n));
       int d =2;
       n = Insert(n,d);
       print(n);
       System.out.println("Total Length : "+len(n));
       int d1 = 6;
       n = Back(n,d1);
       print(n);
       System.out.println("Total Length : "+len(n));
      
    }
    
}
