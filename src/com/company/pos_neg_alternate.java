package com.company;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class pos_neg_alternate {
    public static void main(String arg[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader (System.in));

        int t=Integer.parseInt(read.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(read.readLine());

            String st=read.readLine();
            String []strs=st.split(" ");

            int []arr=new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(strs[i]);

            }

            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > 0 && arr[j] >= 0) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        break;
                    } else
                        break;

                }
            }
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");

        }
    }
}
