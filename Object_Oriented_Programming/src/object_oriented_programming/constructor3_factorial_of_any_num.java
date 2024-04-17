/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented_programming;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
class factorial{
    int a;
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        a=sc.nextInt();
    }
    public void setdata()
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
         f*=i;   
        }
        System.out.println("Factoral:- "+f);
        
    }
    factorial(factorial f)
    {
        this.a=f.a;
    }
    factorial()
    {
        
    }
}
public class constructor3_factorial_of_any_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        factorial f1=new factorial();
        f1.getdata();
        factorial f2=new factorial(f1);
        f2.setdata();
        
        
    }
    
}
