package com.company;
import java.util.*;
public class Traingular_number {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int x=1;
        int tnum=1;
        while(tnum<n)
        {
            x++;
            tnum+=x;
            System.out.print(tnum);
        }
        if (tnum==n)
            System.out.print("true");
        else
            System.out.print("false");
    }
}
