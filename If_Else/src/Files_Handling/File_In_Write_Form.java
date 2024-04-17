/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files_Handling;

/**
 *
 * @author khushi pandey
 */
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class File_In_Write_Form {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FileWriter obj1=new FileWriter("C:\\Users\\khushi pandey\\Documents\\file1.txt");
            Scanner sc=new Scanner(System.in);
            String str;
            System.out.println("Enter Any Text");
            str=sc.nextLine();
            obj1.write(str);
            obj1.close();
        }
        catch(IOException e){
            System.out.println("Error:-"+e.getMessage());
        }
    }
    
}
