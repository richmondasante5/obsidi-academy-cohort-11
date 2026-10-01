package com.bptn.course._04_Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args){

        String reverse="";

        //prompt to enter a word
        System.out.print("Enter a word: ");
        Scanner scanner= new Scanner(System.in);

        //WHAT THE USER TYPES
        String input=scanner.nextLine();

        //USING FOR LOOP TO CHECK WHAT THE USER WRITES
        for(int i=input.length()-1; i>0; i--){
            reverse=reverse+input.charAt(i);

            //checking if the
            //if()
        }


    }
}
