/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package time_module;

/**
 *
 * @author khushi pandey
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Time_Module_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LocalDateTime obj=LocalDateTime.now();
        System.out.println("Before Formatting:- "+obj);
        DateTimeFormatter myformatobj=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String FormattedDate=obj.format(myformatobj);
        System.out.println("After Formatting: "+FormattedDate);
    }
    
}
