/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package STACK;

/**
 *
 * @author khushi pandey
 */
import java.io.*;
class Stackx{
    private int maxSize; //size of stack array
    private double[] stackArray;
    private int top;  //top of stack
    public Stackx(int s)
    {
        maxSize = s;  // set array size
        stackArray =  new double[maxSize]; //create array
        top = -1;  //no items yet
    }
    public void push (double j)  //[put item on topm of Stack
    {
        stackArray[++top] = j;   //increment top, insert item
    }
    public double pop() //take an item from top of stack
    {
        return stackArray[top--]; //Access an Item, Decrement top
    }
    public double peek()//peek at top of stack
    {
        return stackArray[top];
    }
    public boolean isEmpty()  //true if stack is empty
    {
        return (top == -1);
    }
    public boolean isfull()  //true if stack full
    {
        return (top == (maxSize - 1));
    }
}
public class Demonstrate_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stackx thestack = new Stackx(10);  // to make a new stack
        thestack.push(20);  //push items onto stack
        thestack.push(40);
        thestack.push(50);
        thestack.push(80);
        while(!thestack.isEmpty())  //util it's empty
        {
            //delete items from stack
            double value = thestack.pop();
            System.out.print(value); //display it
            System.out.println("");
        }//end while
        System.out.println("");
        
    }
    
}
