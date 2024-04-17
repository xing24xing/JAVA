/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

import static Recursion.Print_All_Subsequence_Of_String.subseq;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */
public class Print_Unique_Substring {

  
     public static void subseq(String str, int ind ,String newString,HashSet<String> set)
    {
       
        if(ind == str.length())
        {
            if(set.contains(newString ))
            {
                return;
            }
            else
            {
            System.err.println(newString);
            set.add(newString);
            return;
        }
        }
        char curchar =str.charAt(ind);
//        to be
        subseq(str,ind+1,newString+curchar,set);
//not to be
        subseq(str,ind+1,newString,set);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Word");
        String word=sc.nextLine();
        System.out.println("Subsequences Of String");
       HashSet<String> set =new HashSet<>();
        subseq(word,0,"",set);
    }
    
}
