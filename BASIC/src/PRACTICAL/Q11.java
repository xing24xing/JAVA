/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
class xyz
{
    xyz()
{
System.out.println("Constructor method........");
}
protected void finalize()
{
System.out.print("Garbage Collected.....");
}
}
public class Q11 {

public static void main(String args[])
{
xyz ob=new xyz();
ob=null;
System.gc();

}
}
