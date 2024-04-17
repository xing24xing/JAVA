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

public class Print_All_Subsequence_Of_String {
// Complexity 
    public static void subseq(String str, int ind ,String newString)
    {
       
        if(ind == str.length())
        {
            System.err.println(newString);
            return;
        }
        char curchar =str.charAt(ind);
//        to be
        subseq(str,ind+1,newString+curchar);
//not to be
        subseq(str,ind+1,newString);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Word");
        String word=sc.nextLine();
         System.out.println("Subsequences Of String");
        subseq(word,0,"");
    }
    
}
