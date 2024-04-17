/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TYPES_OF_SORTING;

/**
 *
 * @author khushi pandey
 */
import java.util.Scanner;
public class Merge_Sort {

    public static void counquer(int arr[],int start,int mid,int end)
    {
        int merged[] = new int[end-start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;
        while(idx1<= mid && idx2<= end)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merged[x++]=arr[idx1++];
               
            }
            else
            {
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid )
        {
             merged[x++]=arr[idx1++];
        }
        while(idx2<=end)
        {
             merged[x++]=arr[idx2++];
        }
        for(int i=0,j=start;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid = start +(end - start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        counquer(arr,start,mid,end);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range Of An Array");
        int range=sc.nextInt();
        int arr[]=new int[100];
        System.out.println("Enter The Elements");
        for(int i=0;i<range;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Merge Sorting");
        divide(arr,0,range-1);
        for(int i=0;i<range;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
}
