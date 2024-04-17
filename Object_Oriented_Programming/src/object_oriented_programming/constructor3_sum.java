/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented_programming;

/**
 *
 * @author khushi pandey
 * 
 */
import java.util.Scanner;
class sum{
    int a,b;
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Two No.");
        a=sc.nextInt();
        b=sc.nextInt();
        
    }
    public void printdata()
    {
        System.out.println("Sum:- "+(a+b));
        System.out.println("Sub:- "+(a-b));
        System.out.println("Multi:- "+(a*b));
        System.out.println("Div:- "+a/b);
    }
    sum(sum s2){
        this.a=s2.a;
        this.b=s2.b;
    }
    sum()
    {
        
    }
}
public class constructor3_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sum s1=new sum();
        s1.getdata();
        sum s2=new sum(s1);
        s2.printdata();
        
        
    }
    
}
