package com.company;
import javax.net.ssl.SSLContext;
import java.util.*;

public class Gsarrayequal
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();

        int l1,l2;
        for (int m=0;m<t;m++)
        {
            int n=in.nextInt();
            int[] a=new int[n];
            int b[]=new int[n];

            for (int i=0;i<n;i++)
                a[i]=in.nextInt();

            for (int j=0;j<n;j++)
                b[j]=in.nextInt();

            l1=a.length;
            l2=b.length;

        }


//        if (l1==l2){
//            System.out.print("1");
//        }
//        else {
//            System.out.print("0");
//        }
//

    }
}
