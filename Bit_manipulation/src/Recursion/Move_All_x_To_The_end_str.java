/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class Move_All_x_To_The_end_str {

    public static void move( String str,int idx,int counter,String newString)
    {
        
        if(idx==str.length())
        {
            for(int i=0;i<counter;i++)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char curchar=str.charAt(idx);
        if('x'==curchar)
        {
            counter++;
            move(str,idx+1,counter,newString);
        }
        else
        {
            newString+=curchar;
            move(str,idx+1,counter,newString);
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String word;
        System.out.println("Enter Any Word");
        word=sc.nextLine();
        move(word,0,0,"");
        
        
    }
    
}
