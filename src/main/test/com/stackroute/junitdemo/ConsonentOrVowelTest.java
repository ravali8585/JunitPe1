package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonentOrVowelTest {
    ConsonentOrVowel check;
    @Before
    public void setUp() {

        System.out.println("Before");
        check = new ConsonentOrVowel();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        check= null;

    }
    @Test
    public void givenNumberShouldReturnConsonent(){

        //arrange

        //act

        String result= check.print("Ravali");
        //assert
        assertEquals("Entered character is Consonent",result);

    }

    @Test
    public void givenNumberShouldReturnVowel(){

        //arrange

        //act

        String result= check.print("arty");

        //assert
        assertEquals("Entered character is  Vowel",result);

    }
    @Test
    public void givenNumberShouldReturnAlphabet(){

        //arrange

        //act

        String result= check.print("5");

        //assert
        assertEquals("Not an alphabet",result);


    }
    @Test
    public void givenNumberShouldReturnNull() {

        //arrange

        //act

        String result = check.print(" ");
        //assert
        assertNotNull(result);

    }


}