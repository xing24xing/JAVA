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
public class File_Creation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            File obj=new File("C:\\Users\\khushi pandey\\Documents\\file1.txt");
            if(obj.createNewFile()){
                System.out.println("File is Created");
            }
            else
                    {
                        System.out.println("File Already Exists Or Not Created");
                    }
        }
        catch(IOException e){
            System.out.println("Error:- "+e.getMessage());
        }
    }
    
}
