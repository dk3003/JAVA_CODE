package com.company;
import java.util.*;
public class reverse_a_array {

    public static void main(String arg[])
    {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     while(t>0)
     {
         int n=in.nextInt();
         int[] arr=new int[n];
         for (int i=0;i<n;i++)
             arr[i]=in.nextInt();
         int start=in.nextInt();
         int end=in.nextInt();

         for (int i=0;i<start-1;i++)
             System.out.print(arr[i]+" ");
         for (int j=end-1;j>=start-1;j--)
             System.out.print(arr[j]+" ");
         for (int i=end;i<n;i++)
             System.out.print(arr[i]+" ");
         t--;

     }
    }
}
