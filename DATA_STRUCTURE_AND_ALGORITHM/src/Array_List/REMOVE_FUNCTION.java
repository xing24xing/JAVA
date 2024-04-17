/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array_List;

/**
 *
 * @author khushi pandey
 */
import java.util.*;
import java.util.ArrayList;
public class REMOVE_FUNCTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>nums=new ArrayList<>();
        int i,n,num,idx;
        System.out.println("Enter No oF Items U Want");
        n=sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            num=sc.nextInt();
            nums.add(i,n);
        }
        System.out.println("ArrayList: "+nums);
        System.out.println("Enter The Index U Want To Remove");
        idx=sc.nextInt();
        nums.remove(idx-1);
        System.out.println("Change ArrayList: "+nums);
        
    }
    
}
