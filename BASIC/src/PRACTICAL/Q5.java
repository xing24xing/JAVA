/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static int decimal_con(int binary)
    {
        int decimal = 0;
        int n = 0;
        while(true)
        {
            if(binary == 0)
            {
                break;
            }
            else
            {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary/=10;
                n++;
            }
            
        }
        return decimal;
    }
    
    public static void binary_con(int decimal)
    {
        int binary[] = new int [40];
        int idx = 0;
        while(decimal > 0)
        {
           
                binary[idx++] = decimal%2;
                decimal = decimal/2;
        }
        for(int i = idx - 1;i >= 0;i--)
        {
            System.out.print(binary[i]);
        }
        
            
        System.out.println("");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int binary = 1010;
       
        System.out.println("Binary to Decimal Conversion Of "+ binary+" is "+  decimal_con(binary));
        
         int decimal = 10;
         System.out.print("Decimal to Binary Conversion Of "+ decimal+" is " );
          binary_con(decimal);
    }
    
}
