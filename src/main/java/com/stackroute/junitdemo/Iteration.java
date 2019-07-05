package com.stackroute.junitdemo;

public class Iteration {
    public String loop(int n) {
        String a="";

        int i, j;
        if(n<1)//to check given number is less than 1 or not
        {
            return "error";
        }
        else {

            // for loops ar uesd for iterating numbers
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    a=a+i;
                }
            }
            return a;
        }
    }



}
