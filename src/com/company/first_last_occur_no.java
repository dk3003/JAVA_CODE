package com.company;
import java.util.*;
public class first_last_occur_no {
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

            Arrays.sort(arr);
            int start=0;
            int end=0;
            for (int i=0;i<n;i++)
            {
                for (int j=i+1;j<n;j++)
                {
                    if(arr[i]!=arr[j])
                        break;
                    else if(arr[i]==arr[j])
                        start=i;
                        end=j;


                }
            }
            System.out.print(start+" "+end);
            t--;
        }
    }
}
