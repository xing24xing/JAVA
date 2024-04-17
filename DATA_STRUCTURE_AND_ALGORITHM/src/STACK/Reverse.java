/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package STACK;

import java.io.*;
import java.util.*;
class Stackx{
    private final int maxSize;
    private final char[] stackArray;
    private int top;
    public Stackx(int max)
    {
        maxSize = max;
        stackArray =new char[maxSize];
        top = -1;
    }
   public void push (char j)  //[put item on topm of Stack
    {
        stackArray[++top] = j;   //increment top, insert item
    }
    public char pop() //take an item from top of stack
    {
        return stackArray[top--]; //Access an Item, Decrement top
    }
    public char peek()//peek at top of stack
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
class reverser{
    private String input; //input string
    private String output; //output string
    public reverser(String in)
    {
        input = in;
    }
    public String dorev()
    {
        int stackSize = input.length();  //get max stack size
        Stackx thestack = new Stackx(stackSize); // make stack
        for(int j =0;j < input.length();j++)
        {
            char ch = input.charAt(j); //get a char from imput
            thestack.push(ch); //push it
        }
        output = "";
        while(!thestack.isEmpty())
        {
            char ch = thestack.pop();  //pop a char
            output =output + ch; //append to output
        }
        return output;
    } //end dorev()
   
}

public class Reverse {

   
    public static String getString() throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String s = br.readLine();
return s;
}
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);
        String input, output;
        while(true)
        {
            System.out.println("Enter Any String");
            System.out.flush();
            input = getString();// read String from kdb
            if(input.equals("")) // quit if [Enter] 
            {
                break;
            }
                // make a reverser
                reverser thereverser = new reverser(input);
                output = thereverser.dorev();// use it
                System.out.println("Reversed : "+output);
            
        }
    }
    
}
