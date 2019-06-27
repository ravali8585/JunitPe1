package com.stackroute.junitdemo;

public class ConsonentOrVowel {
    public static String print( String str)
    {
        int i=0;


        char ch=str.charAt(0);
        //char ch=sc.nextChar();
        switch(ch)
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
