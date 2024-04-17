/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databse;

/**
 *
 * @author khushi pandey
 */
import java.io.*;
import java.sql.*;
public class database {
    
    public static void main(String args[])throws IOException {
        DataInputStream ds = new DataInputStream(System.in);
        System.out.println("Enter Your Name : ");
        String name = ds.readLine();
        System.out.println("Enter Your Age : ");
        int age = Integer.parseInt(ds.readLine());
        System.out.println("Enter Your Course");
        String course = ds.readLine();
        try{
            Class.forName()
        }
    }catch(Exception e){
            System.out.println("Error Find"+e);
    }
}
