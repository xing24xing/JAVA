/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOST_IMPORTANT;

//Longest SubString Without Reapting Characters 

import java.util.HashSet;
import java.util.Set;
//import javax.xml.stream.events.Characters;

public class Longest_SubString {
    public static int findLongestSubstring(String str){
        Set<Character> set = new HashSet<>();
        int l = 0 , r = 0, maxLength = 0;
        while(r < str.length()){
            if(!set.contains(str.charAt(r)))
            {
                set.add(str.charAt(r++));
                maxLength = Math.max(maxLength, r - l);
            }else{
                set.remove(str.charAt(l++));
            }
        }
        return maxLength;
        
    }
    public static void main(String[] args) {
        String s = "abcabccbb";
         
        System.out.println("Output : "+ findLongestSubstring(s));
        
    }
    
}
