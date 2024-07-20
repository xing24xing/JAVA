/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;
import java.util.Scanner;
public class Palindrome_String {

   public static boolean isPalindrome(String str,int l,int r){
       if(l >= r) {return true;}
       if(str.charAt(l)!= str.charAt(r)){
          return false;
       }
          
       return isPalindrome(str,l+1,r-1);
       
       
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter Any String");
        str = sc.nextLine();
       boolean res = isPalindrome(str,0,str.length()-1);
       if (res) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
}
