package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {

        StringReverse str;
        @Before
        public void setUp() {

            System.out.println("Before");
            str = new StringReverse();
        }

        @After

        public void tearDown() {
            System.out.println("After");
            str= null;

        }
        @BeforeClass
        public static void setUpBeforeClass() {

            System.out.println("Beforeclass");

        }

        @AfterClass

        public static  void tearDownBeforeClass() {
            System.out.println("Afterclass");

        }



        @Test
        public void givenReverseStringShouldReturnReverseString(){

            //arrange
             StringReverse str = new StringReverse();
            //act

            String result= str.stringReverse("london");

            //assert
            assertEquals("nodnol",result);

        }

        @Test
        public void givenOneEmptyOneNullShouldReturnActualString(){

            //arrange
            StringReverse str = new StringReverse();
            //act

            String result= str.stringReverse("nodnol");

            //assert
            assertEquals("london",result);

        }






    }