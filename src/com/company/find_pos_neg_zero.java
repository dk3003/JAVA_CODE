package com.company;
import java.util.*;
public class find_pos_neg_zero {

    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int length=arr.length;
        double sum=0;
        double diff=0;
        double zero=0;
        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
             if(arr[i]>0)
                sum+=1;
                else if(arr[i]<0)
                     diff+=1;
                else if (arr[i]==0)
                    zero+=1;
            }
        System.out.println();
        System.out.printf("%.6f %n",sum/length);
        System.out.printf("%.6f %n",diff/length);
        System.out.printf("%.6f %n",zero/length);
        }

    }
