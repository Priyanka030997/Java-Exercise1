package main.java.com.stackroute.pe1;

import java.io.*;
import java.util.*;
public class Vowelconsonants {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        for (int i = 0; i < line.length(); i++) {
            char character = line.charAt(i);
            FindVowelConsonants(character);


        }
    }
    //find character is vowel or consonants
        public static void FindVowelConsonants(char ch)
        {


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.print("Vowel ");
            }
            else if(((ch>=65)&&(ch<=90))||((ch>=97)&&(ch<=122))){
                System.out.print("Consontant ");
            }
            else
            {
                System.out.print("Error");
            }

        }
    }

