/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class Print_Keypad_Combination {

    
    public static String [] keypad = {".", "abc", "def" ,"ghi" ,"jkl" ,"mno" ,"pqr" ,"stu" ,"vwx" ,"yz"};
    public static void KeypadCom(String str,int idx,String newString){
        if(idx==str.length())
       {
           System.out.println(newString);
           return;
       }
       char curchar=str.charAt(idx);
       String map = keypad[curchar - '0'];
      
         for(int i = 0;i < map.length();i++)
         {
            KeypadCom(str,idx+1,newString+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter erString For Combination");
        String str =sc.next();
//      String str = "23";
        KeypadCom(str,0,"");
    }
    
}
