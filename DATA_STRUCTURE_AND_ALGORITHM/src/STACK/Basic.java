/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package STACK;

import java.util.ArrayList;
import java.util.Stack;

public class Basic {
//   private Node head;
//   public static Node head;
//   static class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//   static class Stack{
//       
//       public static boolean isEmpty(){
//          return head == null;           
//       }
//       public static void push(int data){
//           Node n = new Node(data);
//         if(isEmpty()){
//             head = n;
//             return;
//         }
//         else{
//             n.next = head;
//             head = n;
//       }
//       }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//            int top = head.data;
//               head = head.next;
//               return top;
//         }
//         
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int peek = head.data;
//             return peek;
//         }
//   
//   
//    
//        
//    }
//    USING ARRAY LIST STACK IMPLEMENTAITION    
//   static class Stack{
//       static  ArrayList <Integer> arr = new ArrayList<>();
//        public static boolean isEmpty(){
//            return arr.size() == 0;
//        }
//        public static void push(int data){
////            if(isEmpty()){
////                
////            }
//            arr.add(data);
//            
//        }
//        public static int pop(){
//            if(isEmpty()){
//                return -1;
//            }
//            int top = arr.get(arr.size()-1);
//            arr.remove(arr.size()-1);
//            return top;
//        }
//        public static int peek(){
//            if(isEmpty()){
//                return -1;
//            }
//            return arr.get(arr.size() -1);
//        }
//    }
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
       int top = s.pop();
       pushAtBottom(data,s);
       s.push(top);
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        Stack s = new Stack();
       Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4,s);
         while(!s.isEmpty()){
             System.out.println(s.peek());
             s.pop();
        }
       
        
        
    }
    
}
