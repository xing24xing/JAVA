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
//hierarical inheritance
class shape2{
    float area;
      public void area()
    {
        System.out.println("Display Area");
    }
}
class triangle2 extends shape2
{
    public void  area(float base,float height)
    {
        
        area=1/2*base*height;
        System.out.println("Area Of Triangle:- "+area);
    }
}
class EquilateralTriangle1 extends triangle2{
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);   
    }
}
class circle extends shape2{
    public void area(int r)
    {
        System.out.println((3.14)*r*r);
    }
}
public class hybrid_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EquilateralTriangle e1=new EquilateralTriangle ();
        e1.area();
        e1.area(4, 5);
        e1.area(6, 8);
        circle c1= new circle();
        c1.area();
        c1.area(5);
 
    }
    
}
