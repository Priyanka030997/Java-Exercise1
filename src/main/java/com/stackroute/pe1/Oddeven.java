package main.java.com.stackroute.pe1;

import java.io.*;
import java.util.*;
public class Oddeven {
    //main class
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int result= FindEvenOdd(num);
       if(result==1)
       {
           System.out.println("Jerry");
       }
       else
       {
           System.out.println("Tom");
       }
    }
//find even or odd
    public static int FindEvenOdd(int number)
    {
        if((number%2==0)&&((number>=20)&&(number<=30)))
        {
         return 1;
        }
        else
        {
            return 0;
        }
    }
}
