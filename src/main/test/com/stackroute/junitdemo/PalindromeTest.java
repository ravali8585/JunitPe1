package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp() {

        System.out.println("Before");
        palindrome = new Palindrome();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        palindrome = null;

    }
    @Test
    public void givenNumberShouldReturnPalindromeGreaterThan25(){

        //arrange

        //act

        String result= palindrome.palin(2888882);
        //assert
        assertEquals("sum of even numbers is greater than 25",result);

    }

    @Test
    public void givenNumberShouldReturnPalindromeLessThan25(){

        //arrange

        //act

        String result= palindrome.palin(211112);

        //assert
        assertEquals("sum of even numbers is less than 25",result);

    }
    @Test
    public void givenNumberShouldReturnNotpalindrome(){

        //arrange

        //act

        String result= palindrome.palin(15);

        //assert
        assertEquals("not palindrome",result);

    }


}