package com.bptn.course.CodeTest.Collections_List;

import java.util.ArrayList;
import java.util.List;

public class CovertArrayListToList {

    // Complete the functionality of the method below
    public static ArrayList<String> convertArrayToList(String[] inputArray) {

        // create new ArrayList of String
        ArrayList<String> arrayList = new ArrayList<>();

        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Note: Use add() method to add elements to ArrayList.
        for (String inputValue : inputArray) {
            arrayList.add(inputValue);
        }

        // return the new arrayList of String
        return arrayList;
    }

    public static void main(String[] args) {

        // declare an array and initialize it
        String[] arr = {"Value1", "Value2", "Value3"};

        ArrayList<String> convertedList = convertArrayToList(arr);

        System.out.println(convertedList);
    }
}
