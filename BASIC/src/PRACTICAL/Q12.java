/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
class shape{
    float area;
      public void area()
    {
        System.out.println("Display Area");
    }
}
class triangle extends shape
{
    public void  area(float base,float height)
    {
        
        area=base*height;
        System.out.println("Area Of Triangle:- "+area);
    }
}
public class Q12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        // TODO code application logic here
        triangle t1=new triangle();
        t1.area();
        t1.area(5, 3);
    
    }
    
}
