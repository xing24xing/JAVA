/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ARRAY;

/**
 *
 * @author khushi pandey
 */
public class Triangle_Patter_In_2D_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k=0;
        for(i=0;i<4;i++){
//            k=0;
            for(j=0;j<i+1;j++){
                twoD[i][j] = k;
                k=k+1;
            }
            
           for(i=0;i<4;i++)
             {
                 for(j=0;j<i+1;j++){
                     System.out.print(twoD[i][j]+" ");
                    
                     }
                  System.out.println("");
             }
        }
    }
    
}
