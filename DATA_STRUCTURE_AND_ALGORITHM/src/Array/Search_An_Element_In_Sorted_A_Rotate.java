/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class Search_An_Element_In_Sorted_A_Rotate {

   public static int find(int []a,int key){
       int l = 0,h = a.length - 1;
       System.out.println(h);
       while(l <= h){
           int m = (l + h)/2;
           if(a[m] == key) 
           {return m;}
           if(a[l] < a[m]) {
               if(key >= a[l] && key < a[m]){
                   h = m - 1;
               }else{
                   l = m + 1;
               }
           }else{
               if(key >= a[m] && key <= a[h]){
                   l = m + 1;
               }else{
                   h = m - 1;
               }
           }
       }
       return -1;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a ={8,9,10,11,13,1,2,3,4};
        int res=find(a,11);
        if(res != -1){
            System.out.println("Index Is:"+(res+1));
        }else{
            System.out.println("Index Not Found");
        }
    }
    
}
