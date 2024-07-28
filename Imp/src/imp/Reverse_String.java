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
             System.out.println(i+" Val front "+front);
            int back=sb.length()-1-i;
            System.out.println(i+" Val back "+back);
            char frontchar=sb.charAt(front);
            System.out.println(i+" val frontchar "+frontchar);
            char backchar=sb.charAt(back);
            System.out.println(i+" val backChar "+backchar);
            sb.setCharAt(front, backchar);
            System.out.println(i+" val 1 sb "+sb);
            sb.setCharAt(back, frontchar);
             System.out.println(i+" val 2 sb "+sb);
        }
        System.out.print(sb);
    }
    
}
