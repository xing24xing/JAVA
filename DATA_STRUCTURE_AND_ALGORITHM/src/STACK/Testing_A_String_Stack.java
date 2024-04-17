/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package STACK;

/**
 *
 * @author khushi pandey
 */
import java.util.*;
public class Testing_A_String_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deque <String> stack = new ArrayDeque<String>();
        stack.push("GB");
        stack.push("DE");
        stack.push("FR");
        stack.push("ES");
        System.out.println(stack);
        System.out.println("Stack.peek() : "+stack.peek());
        System.out.println("Stack.pop() : "+stack.pop());
        System.out.println(stack);
        System.out.println("Stack.pop() : "+stack.pop());
        System.out.println(stack);
        System.out.println("Stack.push(\"IE\"): ");
        stack.push("IE");
        System.out.println(stack);
    }
    
}
