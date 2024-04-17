/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class armstrong_no_or_not {

    public static int sum=0;
    public static int  cal(int n)
    {
        int rem;
        
        if(n>0)
        {
              rem=n%10;
            sum+=rem*rem*rem;
            cal(n/10);
            
        }
        
        else
        {
            return sum;
        }
        return sum;
    }
    public static int armstrong(int n)
    {
        if(cal(n)==n)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int no=sc.nextInt();
        int ans=armstrong(no);
        if(ans==1)
        {
            System.out.println(no+" is an armstrong no.");
        }
        else
        {
            System.out.println(no+" not is an armstrong no");
        }
    }
    
}
