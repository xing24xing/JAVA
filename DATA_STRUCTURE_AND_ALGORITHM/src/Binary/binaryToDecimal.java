/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Binary;

/**
 *
 * @author khushi pandey
 */
public class binaryToDecimal {

    public static int binaryToDecimal(int num) {
        int ans = 0, pow = 1;
        while (num > 0) {
            int r = num % 10;
            ans += r * pow;
            num /= 10;
            pow = pow * 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 1000;
        System.out.println(binaryToDecimal(num));
    }

}
