/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
class prac4A
{

public static void main(String args[])
{
   Scanner input=new Scanner(System.in);
int num;
int arr[];
int temp=0;
System.out.print("Enter the size of array: ");
num=input.nextInt();
arr=new int[num];
System.out.print("Enter the number: ");
for(int i=0;i<num;i++)
{
arr[i]=input.nextInt();
}
System.out.print("Given numbers are: ");
for(int i=0;i<num;i++)
{
System.out.println(arr[i]);
}
for(int i=0;i<num;i++)
{
for(int j=i+1;j<num;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.print("Ascending order of number are: \n");
for(int i=0;i<num;i++)
{
System.out.println(arr[i]);
}

for(int i=0;i<num;i++)
{
for(int j=i+1;j<num;j++)
{
if(arr[i]<arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.print("Descending order of number are: \n");
for(int i=0;i<num;i++)
{
System.out.println(arr[i]);
}
}
}