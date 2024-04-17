/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author khushi pandey
 */
public class Split_Four_Digit_No {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=1234,y,z;
        y=x/1000;
        System.out.println("The Digit In A Thousand's Place = "+y);
        z=x%1000;
        y=z/100;
        System.out.println("The Digit In A Hunderd's Place = "+y);
        z=z%100;
        y=z/10;
        System.out.println("The Digit In A Tens's Place = "+y);
        y=z%10;
        System.out.println("The Digit In A Unit Place = "+y);
    }
    
}
