package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class SortingTest {


        Sorting sorting;
        @Before
        public void setUp(){
            System.out.println("Before");
            sorting=new Sorting();
        }
        @After
        public void tearDown(){
            System.out.println("After");
            sorting=null;
        }

    @Test
    public void sortNumber() {
        String expectedResult="Sorted number in non-increasing order : 544332\n" +
                "Sum of even numbers : 10\n" +
                "False";
        String actualResult=sorting.sortNumber(234534);
        assertEquals(expectedResult,actualResult);
    }


}
