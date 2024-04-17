/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class DEMO_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name\n");
        String word=sc.nextLine();
        System.out.print("\nYour Name Is\t:-"+word);   //tab
        System.out.print("\nYour Name Is\f:-"+word);    //formfeed
        System.out.print("\nYour Name Is\b:-"+word);   //backspace
        System.out.print("\nYour Name Is\r:-"+word);  //carriage return
        System.out.print("\nYour Name Is\f:-"+word);  //formfeed
        System.out.print("\nYour Name Is\\:-"+word);  //backslash
        System.out.print("\nYour Name Is\':-"+word);  //single Quotation
        System.out.print("\nYour Name Is\":-"+word);  //double Quotation
//        System.out.print("Your Name Is\d:-"+word);  (Octal)
//        System.out.print("Your Name Is\xd:-"+word);(hexa decimal)
//        System.out.print("Your Name Is:-"+word);(unicode char udkhushi )
        
        
    }
    
}
