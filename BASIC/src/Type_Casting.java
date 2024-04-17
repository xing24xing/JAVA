/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author khushi pandey
 */
public class Type_Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b;
        int i=258;
        double d=340.142;
        System.out.println("\n Conversion Of Int To Byte.....");
        b=(byte)i;
        System.out.println("Interger i :"+i+ " Is Converted To Byte b: "+b);
        System.out.println("\n Conversion Of double To Int.....");
        i=(int)d;
        System.out.println("Double d: "+d+" Is converted To Interger i:"+i);
        System.out.println("\nConversion From Double To Byte.....");
        b=(byte)d;
        System.out.println("Double d:"+d+" Is converted To Byte b: "+b);
    }
    
}
