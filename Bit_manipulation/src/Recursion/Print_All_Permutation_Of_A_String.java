
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */

public class Print_All_Permutation_Of_A_String {
public  static void printPermutation(String str,String Permutation)
{
    if(str.length() == 0)
    {
        System.out.println(Permutation);
        return;
    }
     for(int i = 0; i<str.length();i++)
           {  char currchar = str.charAt(i);
              String newstr =str.substring(0,i)+str.substring(i+1);
              printPermutation(newstr,Permutation+currchar);
              
    
              }
}    public static void main(String[] args) {
        // TODO code application logic here
        String str ="abc";
        printPermutation(str,"");
    }
    
}
