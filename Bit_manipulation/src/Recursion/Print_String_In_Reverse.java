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
public class Print_String_In_Reverse {

    public static void reverse(String s,int i){
    if(i==0)
    {
        System.out.print(s.charAt(i));
        return;
    }
            System.out.print(s.charAt(i));
            reverse(s,i-1);
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String word;
        System.out.println("Enter Any Word");
        word=sc.nextLine();
        reverse(word,word.length()-1);
    }
    
}
