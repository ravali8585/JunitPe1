package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessTheRandonNumberTest {


        GuessTheRandonNumber guessTheRandomNumber;
        @Before
        public void setUp(){
            System.out.println("Before");
            guessTheRandomNumber=new GuessTheRandonNumber();
        }
        @After
        public void tearDown(){
            System.out.println("After");
            guessTheRandomNumber=null;
        }

        @Test
        public void guessedNumberIsMoreThanGivenNumber(){
            //act
            String result=guessTheRandomNumber.guessingNumber(6,1);

            //assert
            assertEquals("guessed number is less than the original number",result);
        }
        @Test
        public void guessedNumberIsLessThanGivenNumber(){
            //act
            String result=guessTheRandomNumber.guessingNumber(6,16);

            //assert
            assertEquals("guessed number is more than the original number",result);
        }
        @Test
        public void guessedNumberMatchesGivenNumber(){
            //act
            String result=guessTheRandomNumber.guessingNumber(16,16);

            //assert
            assertEquals("guessed matches the original number",result);
        }



    }

