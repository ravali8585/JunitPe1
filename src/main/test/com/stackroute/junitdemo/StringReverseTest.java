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
<<<<<<< HEAD
=======
        

>>>>>>> 47f856533756e0182fa120edf9d4b342dcc036c9

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
    @Test
    public void givenStringShouldReturnNotNull() {

        //arrange

        //act

        String result = str.stringReverse(" ");
        //assert
        assertNotNull(result);

    }







<<<<<<< HEAD
}
=======
    }
>>>>>>> 47f856533756e0182fa120edf9d4b342dcc036c9
