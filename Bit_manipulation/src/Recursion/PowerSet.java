/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */
public class PowerSet {

   public static void PowerSet(String str,int i,String cur)
   {
      if(i == str.length())
      {
          System.out.println(cur);
          return;
      } 
      System.out.println("1 "+str+" "+i+" "+cur+" "+str.charAt(i));
      
      PowerSet(str,i + 1,cur + str.charAt(i));
       System.out.println("2 "+str+" "+i+" "+cur+" "+str.charAt(i));
      PowerSet(str,i+1,cur);
      System.out.println("3 "+cur);
// System.out.println("2 "+str+" "+i+" "+cur+" "+str.charAt(i));
   }
    public static void main(String[] args) {
        String str = "abc";
        PowerSet(str,0,"");
    }
    
}
