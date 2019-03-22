package com.company;
import java.util.*;
public class Majority_Element {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t>0)
        {
            int n=in.nextInt();

            int[] arr=new int[n];
            for (int i=0;i<n;i++)
                arr[i]=in.nextInt();

            int f=0,temp=0;
            for (int i=0;i<n;i++)
            {
                for (int j=i+1;j<n;j++)
                {
                    if (arr[i]==arr[j])
                        temp=arr[j];
                        f=1;
                    System.out.print("-1");
                 }
            }
            if (f==1)
                System.out.print(temp);

            t--;
        }
    }
}
