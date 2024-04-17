/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class no_negative_positive_zero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.println(a+" is an even no");
        }
        
        else if(a<0)
        {
            System.out.println(a+" is an odd number");
        }
        else
        {
            System.out.println(a+" is a zero");
        }
        
        
    }
    
}
