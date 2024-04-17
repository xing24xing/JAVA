/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package object_oriented_programming;

/**
 *
 * @author khushi pandey
 */
class  Box1{
    double width;
    double height;
    double depth;
    double volume(){
        return width * height * depth;
    }
    void setDim(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
}
public class Adding_Method_That_Makes_Parameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;
//        initialize each box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(2, 6, 9);
//        get volume of second box
        vol = mybox1.volume();
        System.out.println("Volume Is : "+vol);
        vol = mybox2.volume();
        System.out.println("Volume Is :"+vol);
        System.out.println("");
    }
    
}
