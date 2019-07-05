package com.stackroute.junitdemo;

public class SumOfIntegerArguments {

        public String getSumOfArguments(String numbers)
        {
            int sum=0;
            String[]  arr=numbers.split(" ");//to splitting the string
            int[] arr1=new int[arr.length];
            for(int i=0;i<arr.length;i++)
            {
                try{
                    arr1[i]=Integer.parseInt(arr[i]);// typecasting
                }
                catch(Exception e)
                {
                    return "please enter all integers";
                }
                sum=sum+arr1[i];
            }
            return sum+"";
        }
    }

