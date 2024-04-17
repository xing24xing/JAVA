/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String originalstr = "khooshie";
        String reversestr = "";
        for(int i = 0;i< originalstr.length();i++)
        {
            reversestr = originalstr.charAt(i)+reversestr;
        }
        System.out.println("Resverse Of "+originalstr +" is "+reversestr);
    }
    
}
