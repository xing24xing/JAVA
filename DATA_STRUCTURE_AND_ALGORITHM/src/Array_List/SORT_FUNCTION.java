/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author khushi pandey
 */
public class SORT_FUNCTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
        ArrayList<Integer> nums=new ArrayList<>();
        int i,n,num;
        System.out.println("Enter No. Of Items U Want: ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            num=sc.nextInt();
            nums.add(i,num);
        }
        System.out.println("Array List Before  Sorting: "+nums);
        Collections.sort(nums);
        System.out.println("Array List After Sorting: "+nums);
      
    }
    
}
