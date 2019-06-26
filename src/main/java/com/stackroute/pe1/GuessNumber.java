package main.java.com.stackroute.pe1;

import java.io.*;
import java.util.*;
public class GuessNumber {
    //main class
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int Guess=sc.nextInt();
        checkwithoriginalnumber(Guess);
    }
    public static void checkwithoriginalnumber(int number)
    {
        //compare guess number with original number
        int original=15;
        if(number>original)
        {
            System.out.println("Number guessed is more than original number");
        }
        else if(number<original)
        {
            System.out.println("Number guessed is less than original number");
        }
        else if(number==original) {

            System.out.println("Number guessed matches the original number");
        }
    }
}
