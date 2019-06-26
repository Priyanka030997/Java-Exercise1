package main.java.com.stackroute.pe1;

import java.io.*;
import java.util.*;
public class Looping {
    //main class
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
       LoopPrinting(number);

    }
    //generate number series
    public static void LoopPrinting(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
