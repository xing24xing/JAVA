/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imp;

/**
 *
 * @author khushi pandey
 */
public class palindrome {

    public static boolean palindrome(String str,int idx){
//        for(int i = 0;i < str.length();i++){
//            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
//                return false;
//        }
//        return true;
   int len = str.length();
        if(idx >= len/2) return true;
        if(str.charAt(idx)!= str.charAt(len-idx-1))return false;
        return palindrome(str,idx+1);
    }
    public static void main(String[] args) {
        String str = "true";
       boolean res = palindrome(str,0);
        System.out.println(res);
       }
    }
    

