package com.bptn.course.CodeTest;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(Integer.MAX_VALUE/100));
        System.out.println(isPerfectSquare(255));

    }


    public static boolean isPerfectSquare(int num) {
        //fixed: handle edge cases for 0 and negative munber

        if(num<0) return false;
        if(num==0 || num==1) return true;

        //i<num caused compilation error

        for(int i = 1; i*i <= num; i++) {
            if(i*i == num)
                return true;
            else if (i*i > num) return false;
        }

        return false; //fixed return false cos it was expected by compiler
    }
}

