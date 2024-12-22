/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Binary;

/**
 *
 * @author khushi pandey
 */
public class decimalToBinary {

    public static int decimalToBinary(int s) {
        int pow = 1;
        int ans = 0;
        while (s > 0) {
            int r = s % 2;
            ans += (r * pow);
            s = s / 2;
            pow = pow * 10;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int i = 2,j = 10;
         for(int s = i;s < j;s++){
        System.out.println(decimalToBinary(s));
       }

    }

}
