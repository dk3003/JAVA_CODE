package com.company;
import java.util.*;
import java.io.*;
public class pos_neg_array {
    public static void main(String arg[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t>0)
        {
            int n = Integer.parseInt(in.readLine());
            String line=in.readLine();
            String[] val=line.trim().split("\\s+");
            int[] arr=new int[n];
            for (int i=0;i<n;i++)
                arr[i]=Integer.parseInt(val[i]);

            int pos=0,neg=0;
            for (int i=0;i<n;i++)
                if(arr[i]>=0)
                    pos++;
                else
                    neg++;

             int[] a=new int[pos];
             int[] b=new int[neg];

             int m=0,l=0;
            for (int i=0;i<n;i++)
            {
                   if (arr[i]>=0)
                       a[m++]=arr[i];
                   else
                       b[l++]=arr[i];
            }


            int k=n;
            int i=0,j=0;
            while(k>0)
            {
                if (i<m)
                    System.out.print(a[i]+" ");
                k--;
                if(j<l)
                    System.out.print(b[i]+" ");
                k--;
                i++;
                j++;

            }

            t--;
        }
    }
}
