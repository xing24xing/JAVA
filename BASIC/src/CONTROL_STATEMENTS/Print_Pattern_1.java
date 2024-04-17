/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
public class Print_Pattern_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j=6,k=0;
        char x='A';
        while((j/2)>=0){
            for(i=0;i<=(j/2);i++){
                System.out.print(" "+((char)(x+i)));
            }
             i=i-2;
            for(;i>=0;i--){
                System.out.print(" "+((char)(x+i)));
                }
             j=j-2;
             k=k+1;
                System.out.println("\n");
                for(i=0;i<=k;i++){
                    System.out.print(" ");
                
            }
        }
    }
    
}
