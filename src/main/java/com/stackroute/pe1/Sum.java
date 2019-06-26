package main.java.com.stackroute.pe1;

import java.io.*;
import java.util.*;
public class Sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={12,23,2,4};
        int sum=0;
        //sum of elements
        for(int input:arr)
        {
            sum=sum+input;
        }
        System.out.print(sum);
    }
}
