package com.stackroute.junitdemo;

import java.util.Scanner;

public class Palindrome {


    public static String palin(int n) {
        int rem, sum = 0, rev = 0, temp = n;

        while (n > 0) {
            rem = n % 10;  //getting remainder
            rev = (rev * 10) + rem;// getting reverse

            if (rem % 2 == 0)// to find even numbers
            {
                sum = sum + rem;
            }
            n = n / 10;
        }
        if (rev == temp)
        {


            if (sum > 25) {
                return  "sum of even numbers is greater than 25";
            } else {
                return "sum of even numbers is less than 25";
            }
        }return "not palindrome";
    }
}



