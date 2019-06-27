package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOrEvenTest {
    OddOrEven check;
    @Before
    public void setUp() {

        System.out.println("Before");
        check = new OddOrEven();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        check = null;

    }
    @Test
    public void givenNumberShouldReturnJerry(){

        //arrange

        //act

        String result= check.test(24);
        //assert
        assertEquals("Jerry",result);

    }

    @Test
    public void givenNumberShouldReturnTom(){

        //arrange

        //act

        String result= check.test(25);

        //assert
        assertEquals("Tom",result);

    }
    @Test
    public void givenNumberShouldReturnNull(){

        //arrange

        //act

        String result= check.test(15);

        //assert
        assertEquals(null,result);

    }


}