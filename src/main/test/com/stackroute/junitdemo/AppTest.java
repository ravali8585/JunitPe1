package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp() {

        System.out.println("Before");
        app = new App();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        app = null;

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
    public void givenTwoStringShouldReturnConcatinateUpperString(){

        //arrange
        App app=new App();
        //act

         String result= app.concatAndConvertString("hello","world");

        //assert
        assertEquals("HELLOWORLD",result);

    }
    @Test
    public void givenTwoNullShouldReturnErrorMessage(){

        //arrange
        App app=new App();
        //act

        String result= app.concatAndConvertString(null,null);

        //assert
        assertEquals("Null Not Allowed",result);

    }
    @Test
    public void givenOneStringOneNullShouldReturnErrorMessage(){

        //arrange
        App app=new App();
        //act

        String result= app.concatAndConvertString("Hello",null);

        //assert
        assertEquals("Null Not Allowed",result);

    }

    @Test
    public void givenOneEmptyStringOneNullShouldReturnNumericString(){

        //arrange
        App app=new App();
        //act

        String result= app.concatAndConvertString("","5");

        //assert
        assertEquals("5",result);

    }



}