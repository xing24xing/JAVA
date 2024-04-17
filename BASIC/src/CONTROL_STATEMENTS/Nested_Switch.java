/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
public class Nested_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        int j=1;
        switch(i){
            case 0:
                switch(j){
                    case 0:
                        System.out.println("i is 0, j is 0");
                        break;
                    case 1:
                        System.out.println("i is 0, j is 1");
                        break;
                    default:
                        System.out.println("Nested Default Case !!");
                }
                break;
            default:
                System.out.println("No Matching Case Found");
        }
    }
    
}
