package main.java.com.stackroute.pe1;

import java.io.*;
import java.util.*;
public class ReverseString {
    //main class
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        Reverse(input);
    }
    //reverse the string
    public static void Reverse(String str)
    {
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
          reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}
