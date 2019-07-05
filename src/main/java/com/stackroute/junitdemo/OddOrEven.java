package com.stackroute.junitdemo;

public class OddOrEven {
    public String test(int num)
    {

        //Print Tom if number is odd and exists between 20 to 30
        //Print Jerry, if number is even and exists between 20 and 30
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
