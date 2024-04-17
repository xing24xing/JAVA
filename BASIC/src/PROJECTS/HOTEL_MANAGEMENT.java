/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECTS;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
class Register{
    String name;
    String Add;
    int phone_no,no_items,qty;
    float price;
    Scanner sc=new Scanner(System.in);
    Register()
    {
        
        System.out.println("Enter Your Name:-");
        name=sc.nextLine();
        System.out.println("Enter Your Address:-");
        Add=sc.nextLine();
        System.out.println("Enter Your Phone No.:-");
        phone_no=sc.nextInt();
        
    }    
    public void items(){
          System.out.println("  ITEMS            PRICE");
          System.out.println("1.)Samosa Pav       $5");
          System.out.println("2.)Pizza            $10");
          System.out.println("3.)Burger           $4");
          System.out.println("4.)Korean Noodle    $10");  
          System.out.println("5.)Cheese Remen     $20");
   
           System.out.println("Enter Number Of Item U Want:- ");
           no_items=sc.nextInt();
        for(int i=1;i<=no_items;i++){
            System.out.println("Enter Code Of Item U Want");
            int code=sc.nextInt();
            System.out.println("Enter Quantity Of Item U Want");
            qty=sc.nextInt();
          switch(code)
          {
              case 1:price=qty*5;
                  break;
              case 2:price=qty*10;
                  break;
              case 3:price=qty*4;
                  break;
              case 4:price=qty*10;
                  break;
              case 5:price=qty*20;
                  break;
              default:System.out.println("Wrong Input Code No.");
          }
    }
        }
    
    
}
public class HOTEL_MANAGEMENT {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Register r1=new Register();
//        File obj=new File("C:\\Users\\khushi pandey\\Documents\\file1.txt");
        r1.items();
          try{
            FileWriter obj1=new FileWriter("C:\\Users\\khushi pandey\\Documents\\file1.txt");
                System.out.println("File is Created");
                System.out.println("############Luxury Hotel###############");
                System.out.println(r1.Add);
                System.out.println(r1.name);
                System.out.println(r1.phone_no);
                System.out.println(r1.price);
                System.out.println(r1.qty);
        
            obj1.close();
        }
        catch(IOException e){
            System.out.println("Error:-"+e.getMessage());
        }
    }
    
}
