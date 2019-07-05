package com.stackroute.junitdemo;

import java.util.Arrays;

public class Sorting
{
    String compare(int a, int b) //compare values a nd b
     {
        if (a > 15) {
            return "True";
        } else {
            return "False";
        }
    }

    public String sortNumber(int n) //to sort the given numbers
    {

        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        int sum = 0;
        for (char c : ch) {
            if (((int) c) % 2 == 0) {
                sum += (int) c - (int) '0';
            }
        }
        String str = "";
        for (char c : ch) {
            str = c + str;
        }
        return "Sorted number in non-increasing order : " + str + "\n" +
                "Sum of even numbers : " + sum + "\n" + compare(sum, 15);

    }
}
