package com.company;
import java.util.*;
public class max_product_of_num {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t>0)
        {
            int n=in.nextInt();
            int temp=1,pro=1;
            int[] arr=new int[n];
            for (int i=0;i<n;i++)
                arr[i]=in.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[n-1]*arr[n-2]);
            t--;
        }
    }
}
