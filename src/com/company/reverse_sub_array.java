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

                String line1 = in.readLine();
                String[] v = line1.trim().split("\\s+");
                int l = Integer.parseInt(v[0]);
                int r = Integer.parseInt(v[1]);


//                int r=end;
//                for (int i=0;i<start-1;i++)
//                {
//                    System.out.print(arr[i] + " ");
//                }
//                for (int i=start;i<=end;i++) {
//                    System.out.print(arr[r-1] + " ");
//                    r--;
//                }
//                 for (int i=end;i<=n;i++) {
//                     System.out.print(arr[i]+" ");
//                 }

                System.out.print("\n");
            }
            catch (ArrayIndexOutOfBoundsException e){
            }
            t--;

        }
    }

}
