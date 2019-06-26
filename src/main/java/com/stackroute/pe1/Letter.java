package main.java.com.stackroute.pe1;

import java.io.*;
import java.util.*;
public class Letter {
    //main class
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
       FindCharacter(ch);


    }
    public static void FindCharacter(char character)
    {
        //find uppercase or lowercase or digit or special character
        if((character>=65)&&(character<=90))
        {
            System.out.print("Capital main.java.com.stackroute.pe1.Letter");
        }
        else if((character>=97)&&(character<=122))
        {
            System.out.print("Small main.java.com.stackroute.pe1.Letter");
        }
        else if((character>=48)&&(character<=57))
        {
            System.out.print("Digit");
        }
        else if((character>=1)&&(character<=47) || (character>57)&&(character<=64) || (character>90)&&(character<=96) || (character>122)&&(character<=127))
        {

            System.out.print("Special Character");
        }


    }
}
