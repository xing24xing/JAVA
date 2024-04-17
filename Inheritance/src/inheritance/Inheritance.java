/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        triangle t1=new triangle();
        t1.area();
        t1.area(5, 3);
        
    }
    
}
