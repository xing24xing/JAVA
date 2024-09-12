/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package STACK;

import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author khushi pandey
 */
public class pushOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack <Integer> stk = new Stack<>();
        HashSet <Integer> has = new HashSet<>();
        stk.add(4);
        stk.add(5);
        stk.push(6);
        stk.add(6);
//        System.out.println(stk.peek());
//        System.out.println(stk.lastElement());
//        System.out.println(stk.pop());
        System.out.println(stk);
        has.add(6);
        has.add(7);
        has.add(8);
        System.out.println(has);
        
        HashSet <Integer> b= new HashSet<>(has);
         has.add(89);
        has.add(10);
        has.add(34);
        has.add(45);
        
//        System.out.println(has.contains(7));
        System.out.println(has.size());
//        has.addAll(b);
        System.out.println(has);
    }
    
}
