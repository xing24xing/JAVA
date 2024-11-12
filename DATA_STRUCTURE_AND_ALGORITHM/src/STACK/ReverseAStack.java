/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package STACK;

import java.util.Stack;

/**
 *
 * @author khushi pandey
 */
public class ReverseAStack {
//    static Node head;
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//    static class Stack{
//        public static boolean isEmpty(){
//            return head == null;
//        }
//        public static void push(int data){
//            Node n = new Node(data);
//            if(head == null){
//                head = n;
////                return;
//            }else{
//                n.next = head;
//                head = n;
//            }
//        }
//        public static int pop(){
//            if(isEmpty()){
//                return -1;
//            }
//            int top = head.data;
//            head = head.next;
//            return top;
//        }
//        public static int peek(){
//            return head.data;
//        }
//        
//    }
    public static void pushAtBottom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int t = s.pop();
        pushAtBottom(data,s);
        s.push(t);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int t = s.pop();
        reverse(s);
        pushAtBottom(t,s);
    }
    public static void main(String[] args) {
//     Stack s = new Stack() ;
      Stack<Integer> s = new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);
      while(!s.isEmpty()){
          System.out.print(s.peek());
          s.pop();
      }
      reverse(s);
       while(!s.isEmpty()){
          System.out.print(s.peek());
          s.pop();
      }
        System.out.println("");
    }
    
}
