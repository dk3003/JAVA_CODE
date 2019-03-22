package com.company;
import java.util.*;
public class odd_occurence {
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

            int x=0;
            for (int i=0;i<n;i++)
                x=x^arr[i];
            System.out.print(x+" ");



            t--;
        }
    }
}
