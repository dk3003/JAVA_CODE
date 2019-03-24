package com.company;
import java.util.*;
public class maximum_money {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t>0)
        {
            int house=in.nextInt();
            int money=in.nextInt();

            int count=0;
            for (int i=0;i<house;i++)
            {
                count+=money;
                i+=1;
            }

            System.out.print(count);
            System.out.print("\n");
            t--;
        }
    }
}
