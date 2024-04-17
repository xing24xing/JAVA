/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;


class first_fun{  
 
  void run(){
      System.out.println("Running First Function");
  }} 


class second_fun extends first_fun{  
   
  void run(){System.out.println("Running Second Function");} 
}
  
public class Q17 {
    public static void main(String[] args) {
        
        second_fun obj = new second_fun();//creating object  
  obj.run();//calling method  
    }
    
}
