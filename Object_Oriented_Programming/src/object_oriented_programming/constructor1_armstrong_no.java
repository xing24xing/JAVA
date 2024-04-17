/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented_programming;

/**
 *100
 * @author khushi pandey
 */
import java.util.Scanner;

class armstrong{
    int no,remainder;
    Scanner sc=new Scanner(System.in);
    armstrong()
    {
        System.out.println("Enter Any Number");
        no=sc.nextInt();
    }
    public void printdata()
    {
        System.out.println("All Armstrong Within Given Range");
        for(int i=1;i<=no;i++)
        { 
            int sum=0;
            for(int j=i;j>0;j/=10)
            {
                remainder=j%10;
                sum+=remainder*remainder*remainder;
            }
            if(sum==i)
            {
            System.out.println(i);
        }
        }
    }
   
}
public class constructor1_armstrong_no {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        armstrong a1=new armstrong();
        a1.printdata();
        
    }
    
}
