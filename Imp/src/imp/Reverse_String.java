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
import java.util.Scanner;
public class Reverse_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder sb=new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++)
        {
            int front=i;
            int back=sb.length()-1-i;
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.print(sb);
    }
    
}
