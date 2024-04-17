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
import java.io.File;
public class Delete_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File obj=new File("C:\\Users\\khushi pandey\\Documents\\file1.txt");
        if(obj.delete()){
            System.out.println("File Is Deleted:- "+obj.getName());
        }
        else{
            System.out.println("Failed To Delete The File");
        }
    }
    
}
