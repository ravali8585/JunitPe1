package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest {
    Iteration iteration;
    @Before
    public void setUp() {

        System.out.println("Before");
        iteration = new Iteration();
    }

    @After

    public void tearDown() {
        System.out.println("After");
        iteration= null;

    }
    @Test
    public void givenNumberShouldReturnIteration(){

        //arrange

        //act

        String result= iteration.loop(5);
        //assert
        assertEquals("122333444455555",result);

    }
    @Test
    public void givenNumberShouldReturnError(){

        //arrange

        //act

        String result= iteration.loop(0);
        //assert
        assertEquals("error",result);

    }

}