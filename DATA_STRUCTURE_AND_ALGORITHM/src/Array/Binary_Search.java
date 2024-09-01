/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Binary_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int  [] arr = {-100,-90,1,1,2,3,4,8,90};
      int l = 0;
      int i = 0;
      int r = arr.length - 1;
      boolean flag = false;
      int target = -90;
      while(l < r){
          int m = (l + r)/2;
         
          if(arr[m] == target){
              flag = true;
              break;
      }else if(arr[m] < target){
           l = m + 1;
         
      }
      else  {
          r = m - 1;
         
      }
           
      }
      if(flag){
          System.out.println("Find At Index : ");
      }else{
          System.out.println("Not Find");
      }
    }
    
}
