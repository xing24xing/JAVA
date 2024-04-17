/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array_List;


import java.util.ArrayList;
import java.util.Scanner;
public class ADD_AND_GET_IN_FUNCTION {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        ArrayList<String> cars=new ArrayList<String>();
        String str;
        int n,i;
        System.out.println("Enter No. Of Items U Want: ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            str=sc.next();
            cars.add(i,str);
        }
        
        System.out.println("ArrayList: "+cars+"\nArrayList By Get Method: ");
        for(i=0;i<n;i++)
        {
            System.out.println(cars.get(i));
        }
    }
    
}
