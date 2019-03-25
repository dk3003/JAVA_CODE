package com.company;
import java.util.*;
public class excel {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        String columnName=in.nextLine();
        //columnName = columnName.toUpperCase();
        int value = 0;
        for (int i = 0; i < columnName.length(); i++) {
            int delta = (columnName.charAt(i)) - 64;
            value = value * 26 + delta;
        }
        System.out.print(value);

    }
}