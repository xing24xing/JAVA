/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICE;

/**
 *
 * @author khushi pandey
 */
public class Cal_Simple_Interest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float rateOfInterest,year,amt;
        float FinalAmt;
        amt=10000;
        rateOfInterest=5;
        year=2;
        float Interest=(amt*rateOfInterest*year)/100;
        FinalAmt=amt+Interest;
        System.out.println("Interset is "+Interest+" On "+ amt +" Final Amount Is "+FinalAmt);
    }
    
}
