package com.company;
import sun.awt.AWTAccessor;

import java.util.*;
public class subarrays_with_given_sum {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();
        String[] val=line.split(" ");
        int n=Integer.parseInt(val[0]);
        int s=Integer.parseInt(val[1]);
        int[] arr=new int[n];

        for (int i=0;i<n;i++)
            arr[i]=in.nextInt();

    }
}
