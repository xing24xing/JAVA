/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
public class Continue_Demo_Using_Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OUTER:
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++)
            {
            if(j>i){
                
                System.out.println("");
                continue OUTER;
            }
                System.out.println(" "+(i*j));
        }
        }
        System.out.println("");
    }
    
}
