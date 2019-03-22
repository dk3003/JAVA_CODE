package com.company;
import java.util.*;

public class MINMAX {



    public static void main(String[] args) {
        long[] arr = new long[5];
        Scanner scanner = new Scanner(System.in);
        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < 5; i++) {
            long arrItem =Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }
        long max=arr[0];
        long min=arr[0];
        for (int i=0;i<5;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        long sum=0;
        for (int i=0;i<5;i++)
        {
            sum+=arr[i];
        }
        System.out.println( (sum - max) + " " + (sum - min));

        scanner.close();
    }
}
