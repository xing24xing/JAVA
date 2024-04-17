/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
public class IF_ELSE_IF_DEMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int month=4;
        String season;
        if(month == 12 || month == 1 || month == 2)
        {
            season="winter";
        }
        else if(month == 3 || month == 4 || month ==5)
        {
            season="spring";
        }
        else if(month == 6 || month == 7 || month == 8){
            season="summer";
        }
        else if(month == 9 || month == 10 ||  month == 11)
        {
            season="autumn";
        }
        else{
            season="Bogus Season";
        }
        System.out.println("April Is In The "+ season + ".");
        
    }
    
}
