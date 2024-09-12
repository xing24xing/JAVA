/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author khushi pandey
 */
public class MorreysAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arr ={1,2,3,1,1};
        
        int point = 0;
        int cnt = 1;
        for(int i = 1;i < arr.length;i++){
            if(arr[i]== arr[point]){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt == 0){
                point = i;
                cnt = 1;
            }
        }
        int candidate = arr[point];
        for(int i : arr){
            if(i == candidate)
            {
                cnt++;
                
            }
        }
         if(cnt > (arr.length-1)/2)
        {
            System.out.println("Mojority "+ candidate);
        }else{
             System.out.println("Not Present");
         }
        
    }
    
}
