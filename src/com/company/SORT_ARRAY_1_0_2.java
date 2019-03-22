package com.company;
import java.util.*;
import java.io.*;
public class SORT_ARRAY_1_0_2
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while(t>0)
        {
            int n=Integer.parseInt(in.readLine());

            String line=in.readLine();
            String[] val=line.trim().split("\\s");

            int[] arr=new int[n];
            for (int i=0;i<n;i++)
                arr[i]=Integer.parseInt(val[i]);

            int mid=0;
            int high=arr.length-1;
            int low=0;

            for (int i=0;i<n;i++) {
                if (arr[mid] == 0) {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                }

                // If element at mid is 1
                // nothing to do
                else if (arr[mid] == 1) {
                    mid++;
                }

                // If element at mid is 2
                // move it to last
                else {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }



            for (int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.print(" ");
            t--;



        }
    }
}
