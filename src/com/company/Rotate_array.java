package com.company;
import java.io.*;
import java.util.*;
public class Rotate_array {
    public static void main(String arg[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while(t>0)
        {
            int[] arr1=new int[2];
            String val=in.readLine();
            String[] strs = val.trim().split("\\s+");
            for(int i=0;i<2;i++){
                arr1[i] = Integer.parseInt(strs[i]);

            }
            int n=arr1[0];
            int rot=arr1[1];

            int[] arr=new int[n];
            String line=in.readLine();
            String[] strs1 = line.trim().split("\\s+");

            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(strs1[i]);
            }

            StringBuffer sb=new StringBuffer();
            for(int i=0;i<n;i++)
            {
                sb.append(arr[(i+rot)%n]+" ");
            }
            System.out.println(sb);
        }
        t--;
        }
    }
