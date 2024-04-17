/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class Find_DD_MM_YY_Of_Given_no {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       int no,week,month,year;
       int tweek,tmonth,tyear;
        System.out.println("Enter Any Number:-");
        no=sc.nextInt();
        tyear=no%365;
        year=no/365;
        tmonth=tyear%30;
        month=tyear/30;
        tweek=tmonth%7;
       week=tmonth/7;
        System.out.println("Year:- "+year);
        System.out.println("Month:- "+month);
        System.out.println("Week:- "+week);
        System.out.println("Day:- "+tweek);
       
        
        
    }
    
}
