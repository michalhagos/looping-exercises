package com.pluralsight;

public class ForLoop {
    public static void main(String[] args)throws InterruptedException // this helps to count down slowly on the screen
    {
        // create a for loop to count down from 10 to  1

        // this means i will start from 10 and check if it is greater than or equal to 1 and i will decrement
        // by one every time the loop checks it will stop at 0 because it is not greater than 1
//
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000); //
        }
        System.out.println("Launch");
    }
    }





