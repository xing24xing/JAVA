/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOST_IMPORTANT;

public class Trapping_Rain_Water {
    public static int trap(int[] height){
        if(height == null || height.length == 0){
            return 0;
        }
        int n = height.length;
        int left = 0, right = n -1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                    System.out.println("1: leftMax idx " + leftMax);
                }else{
                    water += leftMax - height[left];
                    System.out.println("left Height : "+height[left]);
                    System.out.println("left Leftmax "+leftMax);
                    System.out.println("left Water val "+water+" : "+left);
                    
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                     System.out.println("2 : RightMax idx " + rightMax);
                }else{
                    water += rightMax - height[right];
                     System.out.println("right Height : "+height[right]);
                    System.out.println("right RIGHT "+rightMax);
                    System.out.println("right Water val "+water+" : "+right);
                }right--;
            }
        }
        return water;
    }
   public static void main(String[] args) {
       int [] height = {0,1,0,2,1,0,1,3,2,1,2,1,5};
       System.out.println(trap(height));
       
    }
    
}
