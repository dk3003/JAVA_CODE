package com.company;

import java.util.*;
public class pattern_printing3

{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int line,col,n;
        n=in.nextInt();
        for (line=1;line<=n;line++)
        {
            for (col=1;col<n-line+1;col++)
            {
                System.out.print(" ");
            }
            for (col=n-line+1;col<=n;col++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
