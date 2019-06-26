package main.java.com.stackroute.pe1;

import java.io.*;
import java.util.Scanner;
//main class
public class Sorting {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        NumberSorting(input);

    }
    public static void NumberSorting(int number)
    {
        //sort the number in non-decreasing order
        int arr[]=new int[20];
        int count=0;
        while(number>0)
        {
            arr[count]=number%10;
            count=count+1;
            number=number/10;

        }
        int temp=0;
        for(int i=0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int res=0;
        for(int i=0;i<count;i++)
        {
            res=(res*10)+arr[i];
        }
        System.out.println("Sorted number in non-increasing order : "+res);
        int sum=0;
        for(int i=0;i<count;i++)
        {
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
        }

        System.out.println("main.java.com.stackroute.pe1.Sum of even numbers : "+sum);
        if(sum>15)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
