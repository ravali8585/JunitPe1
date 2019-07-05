package com.stackroute.junitdemo;

public class GuessTheRandonNumber {

        public String guessingNumber(int randomNumber,int userNumber) {
            //to check weather number between 1 to 50
            if(userNumber <= 0 || userNumber > 50)
            {
                return "Enter number between 1 to 50";
            }
            if(userNumber>randomNumber) {
                return "guessed number is more than the original number";
            } else if (userNumber < randomNumber) {
                return "guessed number is less than the original number";
            } else {
                return "guessed matches the original number";
            }
        }
    }

