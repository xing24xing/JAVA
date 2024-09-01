/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HashMap;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author khushi pandey
 */
public class index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TreeSet
        
//        TreeSet <Integer> t = new TreeSet<>();
//        t.add(5);
//        t.add(6);t.add(6);
//        t.add(6);
//        t.add(9);
//        t.add(9);
//        t.add(8);
//        System.out.println(t);

//        Tree Map
        TreeMap <Integer,Integer> t = new TreeMap<>();
        t.put(2, 6);
        t.put(2, 5);
        t.put(3, 6);
        t.put(5, 6);
        t.put(3, 190);
        System.out.println(t.get(3));
        
        System.out.println(t.descendingMap());
        t.remove(3, 190);
        t.size();
//        t.clear();
        t.remove(2);
        System.out.println(t);
        
    }
    
}
