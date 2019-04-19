package com.company;
import java.util.*;
import java.io.*;
public class Immediate_Smaller_Element {
    public static void main(String arg[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while(t>0)
        {
            int size = Integer.parseInt(in.readLine());
            String [] str = in.readLine().split(" ");
            Stack <Integer> stack = new Stack<>();
            stack.push(Integer.parseInt(str[0]));
            StringBuffer sb = new StringBuffer();
            for(int i = 1; i < size; i++) {
                int num = Integer.parseInt(str[i]);
                if(stack.peek() > num) {
                    sb.append(num + " ");
                }else {
                    sb.append("-1 ");
                }
                stack.push(num);
            }
            sb.append(-1);
            System.out.print(sb.toString());
            t--;
        }
    }
}
