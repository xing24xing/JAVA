/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */ 
public class First_and_Last_occurance {

    public static int first=-1;
    public static int last=-1;
    public static void occur(String word,int index,char element){
        
        if(index==word.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curchar=word.charAt(index);
        if(curchar==element)
        {
            if(first==-1)
            {
                first=index;
            }
            else{
                last=index;
            }
        }
        occur(word,index+1,element);
    
}
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc=new Scanner(System.in);
        String word;
        System.out.println("Enter Any Sentence");
        word=sc.nextLine();
        occur(word,0,'a');
        
        
        
    }
    
}
