/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x = "011011",y = "1010111";
        int num1 = Integer.parseInt(x,2);
        int num2 = Integer.parseInt(y,2);
        int sum = num1 + num2;
        String result =Integer.toBinaryString(sum);
        System.out.println("Sum Of "+x +" and "+y+" is "+ result);
    }
    
}
