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
public class File_Information_Handling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File obj=new File("C:\\Users\\khushi pandey\\Documents\\file1.txt");
        if(obj.exists()){
            System.out.println("File Name:- "+obj.getName());
            System.out.println("File Path:- "+obj.getAbsolutePath());
            System.out.println("Writeable:- "+obj.canWrite());
            System.out.println("Readable:- "+obj.canRead());
            System.out.println("File Size In Bytes:- "+obj.length());
        }
        else
        {
            System.out.println("File Doesn't Exist");
        }
    }
    
}
