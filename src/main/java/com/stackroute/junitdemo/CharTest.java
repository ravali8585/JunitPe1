package com.stackroute.junitdemo;

public class CharTest {
    public static String specification( char ch)
    {

        if (ch>=65 && ch<=90) //To check given charecter is between A to B
            return "Character is a capital letter";
        else if (ch>=97 && ch<=122)//To check given charecter is between a to b
            return "Character is a small letter";
        else if (ch>=48 && ch<=57)//to enter charecter is a number
            return "Character is a digit";
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||// to enter charecter is a special symbol
                (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            return "Character is a special symbol";
        else
            return "null";
    }
}
