/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array_List;

import java.util.Stack;
public class stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack <String> animals = new Stack<>();
        animals.push("lion");
        animals.push("zebra");
        animals.push("Dog");
        animals.push("Cat");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
    }
    
}
