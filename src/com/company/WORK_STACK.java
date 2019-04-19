package com.company;
import java.util.*;
public class WORK_STACK {

    static void stack_push(Stack s)
    {
        for (int i=0;i<5;i++)
        {
            s.push(i);
        }
    }

    static void stack_pop(Stack s)
    {
        for (int i=0;i<5;i++)
        {
            Integer y=(Integer)s.pop();
        }
    }

    static void stack_peek(Stack s)
    {
        Integer e=(Integer)s.peek();
        System.out.print("at the top= "+e);
    }
    public static void main(String arg[])
    {
        Stack s=new Stack();
        stack_push(s);
        stack_pop(s);
        stack_push(s);
        stack_peek(s);
    }
}
