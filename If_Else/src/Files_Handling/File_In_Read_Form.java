/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files_Handling;

/**
 *
 * @author khushi pandey
 * 
 */
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
public class File_In_Read_Form {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            File obj=new File("C:\\Users\\khushi pandey\\Documents\\file1.txt");
            Scanner reader=new Scanner(obj);
            while(reader.hasNextLine()){
                String data=reader.nextLine();
                System.out.println(data);
            }
        }
        catch(IOException e){
            System.out.println("Error:- "+e.getMessage());
        }
    }
    
}
