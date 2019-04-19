package com.company;
import java.io.*;
public class Rotating_an_Array {
    public static void main(String arg[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while (t>0)
        {
            int n=Integer.parseInt(in.readLine());
            int[] arr=new int[n];
            String line=in.readLine();
            String[] str=line.trim().split("\\s+");
            for (int i=0;i<n;i++)
                arr[i]=Integer.parseInt(str[i]);

            int size=Integer.parseInt(in.readLine());
            StringBuffer sb=new StringBuffer();
            for (int i=size;i<n;i++)
                sb.append(arr[i]+" ");
            for (int i=0;i<size;i++)
                sb.append(arr[i]+" ");

            System.out.print(sb);
            t--;
        }
    }
}
