package com.bptn.course._04_Strings;

import java.util.Scanner;

public class TestFact
{
    public static void main(String[] args){
        //create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        //assigning the input to a variable for manipulation
        int number = scanner.nextInt();

        //initialize the results variable to 1;
        long fact=1;

        //use forloop to multiply number from 1 up to the input use entered
        for(int i=1; i<=number; i++){
        }
        System.out.println("Factorial of " + number+" is: "+fact);
    }
}



