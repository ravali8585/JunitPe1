package com.stackroute.junitdemo;

public class ConsonentOrVowel {
    public static String print( String str)
    {
        int i=0;

        char ch=str.charAt(0);//This is writing for taking fisrt charecter in th given string

        switch(ch)// switch case for writing to pass vowels
        {
            case  'a' :
            case 'e'  :
            case 'i'   :
            case 'o'  :
            case 'u'  :
            case  'A' :
            case 'E'  :
            case 'I'   :
            case 'O'  :
            case 'U'  :i++;
        }
        if(i==1)
            return "Entered character is  Vowel";
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            return "Entered character is Consonent";
        else
            return "Not an alphabet";
    }

}
