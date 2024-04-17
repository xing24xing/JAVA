/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imp;

/**
 *
 * @author khushi pandey
 */
import java.util.*;
public class Imp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        string builder
        System.out.println("String Builder");
        StringBuilder sb=new StringBuilder("Xing");
//        char at 0
        System.out.println(sb.charAt(0));
//       set char at 0
        sb.setCharAt(0, 'k');
        System.out.println(sb);
//        insert char 0
        
        sb.insert(0,'g');
        System.out.println(sb);
//       insert at 3
        sb.insert(2, 'm');
        System.out.println(sb);
//        delete char given range
        sb.delete(3, 4);
         System.out.println(sb);
//        append char 
         sb.append('o');
         System.out.println(sb);
    }
    
}
