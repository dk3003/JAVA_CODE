package com.company;
import java.util.*;
public class find_the_highest_num {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();

            Arrays.sort(arr);
            System.out.print(arr[n-1]);
            System.out.print("\n");
            t--;
        }
    }
}
