/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit_manipulation;

/**
 *
 * @author khushi pandey
 */
public class set_bit {

    public static void  func(int n){
        if(n > 0){
            func(n  -1);
        System.out.println(n);
         func(n - 1);}
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        long a = 4037913;
        System.out.println(a %5);
       int  n = 4;
        func(n);
        
    }
    
}
