package com.bptn.course.TeamActivity9;

import java.util.List;
import java.util.ArrayList;

public class University {
    // property - get inspired by the UML diagram
    // Create an ArrayList to store all students in the university
    public ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        // add a student to the "university" arraylist
        // Add the given student to the students ArrayList
        students.add(s);
    }

    public Student getStudent(long studentId) {
        // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
        // Loop through the students and check for a matching student ID
        for (Student student : students) {

            // Return the student when the IDs match
            if (student.getStudentId() == studentId) {
                return student;
            }
        }

        // Return null if no student with the given ID is found
        return null;
    }

    public List<Student> searchStudent(String userNamePrefix) {
        // return all students that have usernames beginning with the prefix
        // Create a list to store students whose usernames match the prefix
        List<Student> matchingStudents = new ArrayList<>();

        // Loop through all students in the university
        for (Student student : students) {

            // Check if the student's username begins with the given prefix
            if (student.getUserName().startsWith(userNamePrefix)) {
                matchingStudents.add(student);
            }
        }

        // Return all students whose usernames matched the prefix
        return matchingStudents;
    }

    public boolean deleteStudent(long studentId) {
        // return if a successful deletion happened
        // Loop through the students to find the student with the matching ID
        for (int i = 0; i < students.size(); i++) {

            // Check if the current student's ID matches the given ID
            if (students.get(i).getStudentId() == studentId) {

                // Remove the student at the current index
                students.remove(i);

                // Return true because the student was successfully deleted
                return true;
            }
        }

        // Return false if no student with the given ID was found
        return false;
    }
}