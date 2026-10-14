package com.bptn.course.CodeTest.Collections_List;

// Import the ArrayList class from the java.util package


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers to store numbers
        List<Integer> arrayList = new ArrayList<Integer>();


        // Add elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        //assigning this to array
        int[] ArrayListNum = new int[4];

        for (int number: ArrayListNum) {


            System.out.println("ArrayList Elements:" + arrayList.get(number));
            // Access and print elements in the ArrayList using for-each loop
        }

        // Update an element at index 2 (third element) to 35
        arrayList.set(2, 35);

        // Remove an element at index 1 (second element, which is 20)
        arrayList.remove(1);

        // Print the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());
    }
}

