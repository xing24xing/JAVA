/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONTROL_STATEMENTS;

/**
 *
 * @author khushi pandey
 */
public class Break_Statement_In_2D_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] intArray = new int[][]{{1,2,3,4,5},{10,30,20,40,50}};
        boolean blnFound = false;
        System.out.println("Searching 30 In Two Dimensional Int Array..");
        Outer:
        for(int i=0;i<intArray.length;i++){
               Inner:
            for(int j=0;j<intArray.length;j++)
            {
                if(intArray[i][j] == 30)
                {
                    blnFound = true;
                    break Outer;
                }
            }
        }
        if(blnFound == true){
            System.out.println("30 Found In The Array");
        }
        else
        {
            System.out.println("30 Not Found In The Array");
        }
    }
    
}
