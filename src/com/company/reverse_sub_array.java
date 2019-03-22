package com.company;
import java.io.*;
public class reverse_sub_array
{
    public static void main(String arg[])throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {
            try {
                int n = Integer.parseInt(in.readLine());

                String line = in.readLine();
                String[] val = line.trim().split("\\s+");
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = Integer.parseInt(val[i]);

                String l = in.readLine();
                String[] v = l.trim().split("\\s+");
                int start = Integer.parseInt(v[0]);
                int end = Integer.parseInt(v[1]);


                for (int i = start - 1,j = end - 1; i < j; i++, j--) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                for (int i = 0; i < n; i++)
                    System.out.print(arr[i] + " ");

                System.out.print("\n");
            }
            catch (ArrayIndexOutOfBoundsException e){
            }
            t--;

        }
    }

}
