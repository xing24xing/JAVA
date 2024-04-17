/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */
public class Number_of_ways_to_invite_people {

    /**
     * @param args the command line arguments
     */
    public static int invite(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int way1 = invite(n-1);
        int way2 = (n-1)*invite(n-2);
        return way1+way2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
      int n=4;
        System.out.println("the total no. of ways : "+invite(n));
    }
    
}
