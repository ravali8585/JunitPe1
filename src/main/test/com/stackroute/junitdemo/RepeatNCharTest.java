package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;


    public class RepeatNCharTest {
        RepeatNChar repeat;
        @Before
        public void setUp(){
            System.out.println("Before");
            repeat=new RepeatNChar();
        }
        @After
        public void tearDown(){
            System.out.println("After");
            repeat=null;
        }
<<<<<<< HEAD
=======
        
        @Test
        public void givenStringIsAValidString(){
            //act
            String result=repeat.repeatchar("srujana",4);
>>>>>>> 47f856533756e0182fa120edf9d4b342dcc036c9

        @Test
        public void stringManipulate() {
            String expectedResult="Stackrouterouterouterouterouteroute";
            String actualResult=repeat.stringManipulate("Stackroute",5);
            assertEquals(expectedResult,actualResult);
        }

        @Test
        public void stringManipulate1() {
            String expectedResult="Stackroutetete";
            String actualResult=repeat.stringManipulate("Stackroute",2);
            assertEquals(expectedResult,actualResult);
        }


    }
