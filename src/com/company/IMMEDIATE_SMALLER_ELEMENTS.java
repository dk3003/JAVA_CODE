package com.company;
import java.util.*;
import java.io.*;
public class IMMEDIATE_SMALLER_ELEMENTS {

    public static void main(String arg[])throws IOException
    {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(in.readLine());
        while (t>0)
        {
            int n=Integer.parseInt(in.readLine());
            int[] arr=new int[n];
            String line=in.readLine();
            String[] val=line.trim().split("\\s+");
            for (int i=0;i<n;i++)
                arr[i]=Integer.parseInt(val[i]);
            StringBuffer temp=new StringBuffer();
            for (int i=0;i<n;i++)
            {
                for (int j=i+1;j<n;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        temp.append(arr[j]+" ");
                    }
                    else
                    {
                        temp.append("-1"+" ");
                    }
                    break;
                }
                if(i==arr.length-1)
                    temp.append("-1"+" ");
            }
            System.out.print(temp+" ");
            System.out.print("\n");
            t--;
        }
    }
}
