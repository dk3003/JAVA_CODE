package com.company;
import java.util.*;
public class tcs {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str=in.next();
        int q=in.nextInt();
        int[] arr=new int[q];
        for (int i=0;i<q;i++)
            arr[i]=in.nextInt();

        for (int i=0;i<q;i++)
        {
            int value=arr[i];
            calculate(value-1,str);
        }

    }
    public static  void calculate(int v,String string)
    {
        int count=0;
        char c=string.charAt(v);
        for (int i=0;i<v+1;i++)
        {
            if(string.charAt(i)==c)
            {
                count++;
            }

        }
        System.out.print(count);


    }
}
