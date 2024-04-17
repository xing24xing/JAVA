/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

import javax.swing.*;
public class Jcombobox {
     JFrame f;
  Jcombobox()
     {
         f = new JFrame("Combo Box Example");
         String country[]={"india","taiwan","china","singapore","thailand","japan"};
         JComboBox cb =new JComboBox(country);
         cb.setBounds(50, 50, 90, 20);
         f.add(cb);
         f.setSize(400,500);
         f.setVisible(true);
     }
     
     public static void main(String[] args) {
        // TODO code application logic here
        new Jcombobox();
    }
    
}
