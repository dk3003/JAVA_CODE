package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class kth_largest_ele {
    public static void main(String arg[])throws IOException
    {
       Scanner in=new Scanner(System.in);

       int t=in.nextInt();

       while(t>0)
       {
           int n=in.nextInt();
           int k=in.nextInt();

           int[] arr=new int[n];
           for (int i=0;i<n;i++)
               arr[i]=in.nextInt();

           Arrays.sort(arr);

           for (int j=0;j<k;j++)
           {
               System.out.print(arr[n-j-1]+" ");
           }
           t--;

       }
    }
}
