/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICE;

/**
 *
 * @author khushi pandey
 */
public class Distance_Light_Travel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lightspeed;
        long days,seconds,distance;
        lightspeed=186000;  //approximate speed of light in miles per second
        days=1;                 //specify number of days here
        seconds=days*24*60*60;    // convert to seconds
        distance=lightspeed*seconds;    //compute distance
        System.out.print("In "+days);
        System.out.print(" Days Light Will Travel About ");
        System.out.println(distance +" miles");
        
    }
    
}
