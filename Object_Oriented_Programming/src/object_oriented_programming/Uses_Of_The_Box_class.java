/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package object_oriented_programming;

/**
 *
 * @author khushi pandey
 */
class Box{
    double width;
    double height;
    double depth;
    double volume()
    {
        return width * height * depth;
    }
}
public class Uses_Of_The_Box_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
//        assign different values to mybox's instance variables 
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol = mybox1.volume();
        System.out.println("Volume Is : "+ vol);
//   get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume Is : "+vol);
        
    }
    
}
