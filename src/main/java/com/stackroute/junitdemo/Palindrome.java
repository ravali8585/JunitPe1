package com.stackroute.junitdemo;

import java.util.Scanner;

public class Palindrome {


    public static String palin(int n) {
        int r, sum = 0, rev = 0, temp = n;

        while (n > 0) {
            r = n % 10;  //getting remainder
            rev = (rev * 10) + r;

            if (r % 2 == 0) {
                sum = sum + r;
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



