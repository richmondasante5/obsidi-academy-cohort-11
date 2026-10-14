package com.bptn.course.SelfLearn.Classes.OOPConcepts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListMerge {

    public static void main(String[] args) {

    }

    public static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2)
    {
        // Create a new LinkedList that will contain the elements from both lists.
        LinkedList<Integer> mergedList = new LinkedList<>();

        // Add all elements from the first list to the new list.
        mergedList.addAll(list1);

        // Add all elements from the second list to the new list.
        mergedList.addAll(list2);

        // Sort the merged list so that all elements are in ascending order.
        Collections.sort(mergedList);

        // Return the new sorted LinkedList containing elements from both lists.
        return mergedList;
    }

    // FREEZE CODE BEGIN
    public static void populateList(LinkedList<Integer> list, int elements)
    {
        Random rand = new Random();

        for(int i = 0; i < elements; i++)
            list.add(rand.nextInt(100));
    }
    // FREEZE CODE END

    // Summary:
    // I created a new LinkedList and added all elements from both input lists to it.
    // I then used Collections.sort() to make sure the merged list is sorted.
    // I learned that addAll() can combine the elements of two lists while keeping all elements.
    // I also learned that Collections.sort() can be used to sort a LinkedList.
}