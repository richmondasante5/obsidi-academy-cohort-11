package com.bptn.course.SelfLearn.Classes.OOPConcepts;

//using employee payroll for the case. We don't want any other class to do this: employee.salary=-5000
public class Employee {

    //protecting class variable access
    private String name;
    private double salary;

    //constructor to initialize employee object
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;

    }
    



    public static void main(String[] args){

    }

}
