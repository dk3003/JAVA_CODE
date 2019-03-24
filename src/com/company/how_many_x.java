package com.company;
import java.util.*;
public class how_many_x {

    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();

        while(t>0)
        {
            int count=0,check,result;
            int num=in.nextInt();
            int lower = in.nextInt();
            int upper = in.nextInt();
            for (int i=lower+1;i<upper;i++)
            {
                check=i;
                while(check>0)
                {
                    result=check%10;
                    check/=10;
                    if (result==num)
                        count++;
                }
            }

            System.out.print(count);
            System.out.print("\n");
            t--;
        }


    }
}
