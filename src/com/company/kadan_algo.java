package com.company;
import java.io.*;
public class kadan_algo {
    public static void main(String arg[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while(t>0)
        {
            int n=Integer.parseInt(in.readLine());
            int[] arr=new int[n];
            String arr1=in.readLine();
            String[] line=arr1.trim().split("\\s+");
            for (int i=0;i<n;i++)
                arr[i]=Integer.parseInt(line[i]);

            int sum=0;
            int num=Integer.MIN_VALUE;
            for (int i=0;i<n;i++)
            {
                sum+=arr[i];
                if(num<sum)
                {
                    num=sum;
                }
                if(sum<0)
                {
                    sum=0;
                }
            }
            System.out.print(num);
            t--;

        }

    }
}
