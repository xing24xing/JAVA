/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

/**
 *
 * @author khushi pandey
 */
class first{
    
      public void First()
    {
        System.out.println("First Calling.....");
    }
}
class second extends first
{
    public void  Second()
    {
         System.out.println("Second Calling.....");
    }
}
class third extends second{
    public void Third()
    {
        System.out.println("Third Calling.....");   
    }
}
public class Q13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        third t = new third();
        t.First();
        t.Second();
        t.Third();
        
    
    }
    
}
