/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

import java.util.*;

public class Q8 {
public static void count(String str)
{
int sum=0;
int d=0;
char ch[]=str.toCharArray();
for(int i=0;i<str.length();i++)
{
if(Character.isDigit(ch[i]))
{
sum+=Character.getNumericValue(ch[i]);
}

}
System.out.println("Your addtion is: "+sum);
}
    public static void main(String[] args) {
        
    
        Scanner ob=new Scanner(System.in);
System.out.print("Enter the any string: ");
String s=ob.nextLine();
count(s);
    }
    
}
