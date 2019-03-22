package com.company;
import java.util.*;
public class pattern_printing5 {
    public static void main(String arg[])
    {
        Scanner in =new Scanner(System.in);
        int n,line,col;
        n=in.nextInt();
        int top,bottom=n*2;
        for (line=1;line<=n;line++)
        {
            for (col=1;col<=n;col++) {

                System.out.print(col);
            }
            System.out.print("\n");
            for (col=1;col<=n;col++)
            {
                bottom+=1;
                System.out.print(bottom);
            }

        }

    }


}
