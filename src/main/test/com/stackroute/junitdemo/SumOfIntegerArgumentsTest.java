package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class SumOfIntegerArgumentsTest {

        SumOfIntegerArguments sumofintegerargs;
        @Before
        public void setUp(){
            System.out.println("Before");
            sumofintegerargs=new SumOfIntegerArguments ();
        }
        @After
        public void tearDown(){
            System.out.println("After");
            sumofintegerargs=null;
        }

        @Test
        public void givenStringShouldReturnIntSum(){
            //act
            String result=sumofintegerargs.getSumOfArguments("1 2 3 4 5");

            //assert
            assertEquals("15",result);
        }
        @Test
        public void givenStringWithoutIntegerShouldReturnErrorMessage(){
            //act
            String result=sumofintegerargs.getSumOfArguments("ravali");

            //assert
            assertEquals("please enter all integers",result);
        }
        @Test
        public void givenStringWithNegativenumberShouldReturnErrorIntSum(){
            //act
            String result=sumofintegerargs.getSumOfArguments("1 2 3 4 -5");

            //assert
            assertEquals("5",result);
        }

    }

