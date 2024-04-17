/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "123 abcd e!@ #$";
        char ch;
        int alpha=0,num=0,spe_char=0,space=0;
        for(int i = 0;i< str.length();i++)
        {
            ch = str.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            {
                alpha++;
            }
            else if(ch>='0' && ch<='9')
            {
                num++;
            }
            else if(ch==' ')
            {
                  space++;
            }
            else
            {
                spe_char++;
              
            }
        }
        System.out.println("Total Number Of Alphabate :- "+alpha);
        System.out.println("Total Number Of Number :- "+num);
        System.out.println("Total Number Of Space :- "+space);
        System.out.println("Total Number Of Special Char :-"+ spe_char);
    }
    
}
