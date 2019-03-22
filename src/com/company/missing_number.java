package com.company;
import java.util.*;
public class missing_number {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 1; i < n; i++)
                arr[i] = in.nextInt();

            int sum = 0;
            int tsum = (n * (n + 1)) / 2;
            for (int i = 1; i < n; i++) {
                sum += arr[i];
            }

            System.out.println(tsum - sum);
            t--;
        }
    }
}
