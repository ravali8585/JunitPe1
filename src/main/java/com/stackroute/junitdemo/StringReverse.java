package com.stackroute.junitdemo;
import java.lang.*;

public class StringReverse {
    public   static String stringReverse(String str1)
    {
        if(str1==null || str1.isEmpty())
        {
            return str1;
        }
        String reverse=" ";
        for(int i=str1.length()-1;i>=0;i--)// to find reverse of a given string
        {
            reverse=reverse+str1.charAt(i);
        }
        return reverse;
    }
}


