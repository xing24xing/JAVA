/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
import java.util.ListIterator;
import java.util.ArrayList;
public class Traversing_Linear_Array_In_Reverse_Dir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        add elements to ArrayList Obj
        ArrayList  aList =new ArrayList();
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        aList.add("5");
        aList.add("6");
//        Get an Object Of ListIterator Using ListIterator() method
        ListIterator listIterator = aList.listIterator();
        
//        Traverse In forward direction

        System.out.println("Traversing ArrayList In Forward Direction Using ListIterator");        
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println("Traversing ArrayList In One Direction Using ListIterator");
        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
        
    }
    
}
