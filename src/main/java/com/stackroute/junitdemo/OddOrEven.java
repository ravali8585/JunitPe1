package com.stackroute.junitdemo;

public class OddOrEven {
    public String test(int num)
    {
        String result=null;
        if (num%2==0 && (num>20 && num<30))
        {
            result="Jerry";
        }
        else if (num%2!=0 && (num>20 && num<30))
        {
            result="Tom";
        }
        return result;

    }
}
