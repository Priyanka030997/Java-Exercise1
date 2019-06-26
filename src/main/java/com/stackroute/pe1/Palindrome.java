package main.java.com.stackroute.pe1;

import java.util.Scanner;
public class Palindrome {
    //main class
    public static void main(String args[]) {
        long number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextLong();
        CheckPalindrome(number);
    }

    public static void CheckPalindrome(long num) {
        //check whether the given number is palindrome or not
        long res = num, sum = 0;
        while (num > 0) {
            long dig = num % 10;
            sum = (sum * 10) + dig;
            num = num / 10;
        }
        if (res == sum) {
            //sum of even digits
            long sum2 = 0;
            while (sum > 0) {
                long dig = sum % 10;
                if (dig % 2 == 0) {
                    sum2 = sum2 + dig;
                }
                sum = sum / 10;

            }
            //check sum is greater than 25 or not
            if (sum2 > 25) {
                System.out.println(res + " is main.java.com.stackroute.pe1.Palindrome and the sum of even numbers is greater than 25");
            } else {
                System.out.println(res + " is main.java.com.stackroute.pe1.Palindrome and the sum of even numbers is less than 25");
            }
        } else {
            System.out.println(res + " is not main.java.com.stackroute.pe1.Palindrome");
        }

    }
}

