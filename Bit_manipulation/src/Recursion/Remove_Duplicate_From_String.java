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
//Time Complexity o(n)
import java.util.Scanner;
public class Remove_Duplicate_From_String {

    public static boolean[] map=new boolean[26];
   public static void remove(String str,int idx,String newstring)
   {
       if(idx==str.length())
       {
           System.out.println(newstring);
           return;
       }
       char curchar=str.charAt(idx);
       if(map[curchar-'a']==true)
       {
           remove(str,idx+1,newstring);
       }
       else
       {
           newstring+=curchar;
           map[curchar-'a']=true;
           remove(str,idx+1,newstring);
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Word");
        String word=sc.nextLine();
        remove(word,0,"");
        
    }
    
}
