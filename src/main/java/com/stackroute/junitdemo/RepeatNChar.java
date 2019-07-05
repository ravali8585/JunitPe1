package com.stackroute.junitdemo;

public class RepeatNChar {

    public String stringManipulate(String s, int n) {
        //to find length of substring
        String sub = s.substring(s.length() - n, s.length());
        for (int i = 1; i <= n; i++) {
            s += sub;
        }
        return s;
    }
    }
