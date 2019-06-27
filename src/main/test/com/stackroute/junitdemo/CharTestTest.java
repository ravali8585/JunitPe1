package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharTestTest {

        CharTest test;

        @Before
        public void setUp() {

            System.out.println("Before");
            test = new CharTest();
        }

        @After

        public void tearDown() {
            System.out.println("After");
            test = null;

        }

        @Test
        public void givenNumberShouldReturnSmallLetter() {

            //arrange

            //act

            String result = test.specification('a');
            //assert
            assertEquals("Character is a small letter", result);

        }

        @Test
        public void givenNumberShouldReturnCapitalLetter() {

            //arrange

            //act

            String result = test.specification('A');
            //assert
            assertEquals("Character is a capital letter", result);

        }

        @Test
        public void givenNumberShouldReturnDigit() {

            //arrange

            //act

            String result = test.specification('5');
            //assert
            assertEquals("Character is a digit", result);

        }

        @Test
        public void givenNumberShouldReturnSpecialSymbol() {

            //arrange

            //act

            String result = test.specification('@');
            //assert
            assertEquals("Character is a special symbol", result);

        }

    @Test
    public void givenNumberShouldReturnNull() {

        //arrange

        //act

        String result = test.specification(' ');
        //assert
        assertEquals("null", result);

    }




    }