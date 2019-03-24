package com.company;
import java.util.*;
public class rev_subarray_1 {
    public static void main (String[] args) {
        int arr[] = new int[10000000];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = 0, l = 0, r = 0;
            n = sc.nextInt();

            //int arr[] = new int[n];

            for(int i = 1; i <= n; i++)
                arr[i] = sc.nextInt();

            l = sc.nextInt();
            r = sc.nextInt();
            for(int i = 1; i < l; i++)
                System.out.print(arr[i] + " ");

            int end = r;
            for(int i = l; i <= r; i++)
            {
                System.out.print(arr[end] + " ");
                end--;
            }

            for(int i = r+1; i <= n; i++)
                System.out.print(arr[i] + " ");

            System.out.println();
        }

    }

}
