/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(45);
        list.add(55);
        list.add(67);
        list.add(500);
        list.add(400);
        list.add(200);
        System.out.println(list);
//        list.add(0, 590);
//        System.out.println(list);
//        list.add(3, 50);
//        System.out.println(list);
//        list.add(6, 14);
//        System.out.println(list);
//        List<Integer>newlist = new ArrayList();
//        newlist.add(50);
//        newlist.add(1000);
//        list.addAll(newlist);
//        System.out.println(newlist);
//        System.out.println(list.get(5));
          list.remove(2);
          System.out.println(list);
          list.remove(Integer.valueOf(45));
          System.out.println(list);
//          list.clear();
//          System.out.println("List Is Clear:-\n"+list);
          list.set(4, 60);
          System.out.println(list);
          
          System.out.println(list.contains(400));
          for (int i = 0; i < list.size(); i++) {
              System.out.println("The Element is :-  "+list.get(i));
            
        }
          for(Integer element:list)
          {
              System.out.println("Foreach Element :-  "+element);
          }
          Iterator<Integer>it = list.iterator();
          while(it.hasNext()){
              System.out.println("iterator :-  "+it.next());
          }
    }
    
}
