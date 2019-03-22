package com.company;
import java.util.*;
public class pattern_printing2 {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int n,line,col;

        n=in.nextInt();

        for (line=1;line<=n;line++)
        {
            for (col=1;col<=n-line+1;col++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
