/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author khushi pandey
 */
public class Count_Total_Paths_In_A_Maze_To_Move {
    public static int maze(int i,int j,int rows,int columns)
    {   if(i== rows || j== columns)
    {
        return 0;
    }
        if(i == rows-1 && j == columns-1)
        {
            return 1;
        }
        int downpaths =maze(i+1,j,rows,columns);
        int rigthpaths = maze(i,j+1,rows,columns);
        return downpaths+rigthpaths;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int m=3,n=2;
        System.out.println("Total Paths : "+maze(0,0,m,n));
        
        
    }
    
}
