package com.company;
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.Arrays;
public class ArrayList_Operation {

    public static void main(String arg[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while (t>0)
        {
            int size=Integer.parseInt(in.readLine());
            int[] arr=new int[size];
            String line = in.readLine();
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<size;i++){
                arr[i] = Integer.parseInt(strs[i]);

            }
            Arrays.sort(arr);
            int m=Integer.parseInt(in.readLine());
            System.out.print(arr[m-1]+" ");
            t--;
        }
    }
}
