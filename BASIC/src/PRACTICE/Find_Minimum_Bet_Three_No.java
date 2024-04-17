/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICE;

/**
 *
 * @author khushi pandey
 */
public class Find_Minimum_Bet_Three_No {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=3,b=7,c=0;
        int result=(a < b ? a : b) < c ? (a < b ? a : b) : c;
        System.out.println("The Minimum Number In "+a+" "+b+" And "+c+" is "+result);
    }
    
}
