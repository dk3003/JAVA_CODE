package com.company;
import java.util.*;
public class loop {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for (int i=1;i<=t;i++)
        {
            int n=in.nextInt();
            int[] arr=new int[n];
            for (int j=0;j<=n-1;j++)
                arr[j]=in.nextInt();


            for (int a=0;a<=arr.length-1;a++)
               for (int b=0;b<=arr.length-1;b++)
                  System.out.print("("+arr[a]+","+arr[b]+")");
        }
    }
}
