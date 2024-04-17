/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Duplicating_An_array {

    public static void print(int[] a){
        System.out.print("{"+a[0]);
        for(int i=1;i<a.length;i++)
        {
            System.out.print(" , "+a[i]);
        }
        System.out.println("}");
    }
    public static void print(Object [] a)
    {
        System.out.print("{"+a[0]);
        for(int i=1;i<a.length;i++)
        {
            System.out.print(" , "+a[i]);
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a ={22,44,66,88};
        print(a);
        int [] b =(int[])a.clone();
        print(b);
        String [] c = {"AB" ,"CD" ,"EF"};
        print(c);
        String [] d = (String[])c.clone();
        print(d);
        c[1] = "xyz";
        print(c);
        print(d);
    }
    
}
