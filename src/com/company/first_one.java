package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class first_one {
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

            int temp = 0;
            int f = 0;
            for (int i = 0; i < n; i++)
                if (arr[i] == 1) {
                    f = 1;
                    temp = i;

                    break;
                }
            if (f==1)
                System.out.print(temp);
            else
                System.out.print("-1");
            t--;
        }
    }
}
