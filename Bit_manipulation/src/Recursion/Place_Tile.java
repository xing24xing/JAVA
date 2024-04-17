/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */
public class Place_Tile {

    public static int place(int n ,int m)
    {
       //vertically
        if(n == m)
        {
            return 2;
        }
        if(n < m)
        {
            return 1;
        }
        int verticalPlacement = place(n-m,m);
        int horizontalPlacement = place(n-1,m);
        return verticalPlacement+horizontalPlacement;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n=4,m = 2;
        System.out.println("Total Placement Of Ways : "+place(n,m));
        
    }
    
}
