package com.stackroute.junitdemo;

public class Iteration {
    public String loop(int n) {
        String a="";

        int i, j;
        if(n<1)
        {
            return "error";
        }
        else {


            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    a=a+i;
                }
            }
            return a;
        }
    }



}
