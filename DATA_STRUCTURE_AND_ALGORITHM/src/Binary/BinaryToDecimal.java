/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Binary;

/**
 *
 * @author khushi pandey
 */
public class BinaryToDecimal {

    public static int decimalToBinary(int num) {
        int pow = 1;
        int ans = 0;
        while (num > 0) {
            int r = num % 2;
            ans += (r * pow);
            num = num / 2;
            pow = pow * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 50;

        int ans = decimalToBinary(num);
        System.out.println(ans);

    }

}
