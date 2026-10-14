package com.bptn.course.TeamActivity9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Start by looking in the University and Student classes. Implement the methods.

        // Create a bunch of student objects
        Student student1 = new Student(
                123, "testUsername", "password123",
                "John", "Doe", "john@email.com",
                "1234567890", "Toronto", "Male",
                new Date(), new Date(), 1001,
                "Computer Science"
        );

        // (Make sure one student has the following studentId: 123)
        Student student2 = new Student(
                124, "testUsername1", "password124",
                "Mary", "Smith", "mary@email.com",
                "1234567891", "Hamilton", "Female",
                new Date(), new Date(), 1002,
                "Software Development"
        );

        // (Make sure one other student has the following username: testUsername1)
        Student student3 = new Student(
                125, "testUsername2", "password125",
                "Alex", "Brown", "alex@email.com",
                "1234567892", "Burlington", "Male",
                new Date(), new Date(), 1003,
                "Cybersecurity"
        );

        // Create instance of university called "university" and populate it with the students.
        University university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        System.out.println("\nUniversity ------ \n" + university.students);
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.students);

    }
}