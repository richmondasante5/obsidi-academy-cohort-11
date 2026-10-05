package com.bptn.course.CodeTest;

public abstract class Vehicle {

    // Attributes shared by all vehicles
    String make;
    String model;
    int year;
    boolean isEngineOn = false;

    // Constructor for the abstract class
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Concrete method
    public void displayBasicInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Abstract methods. They need no method body;
    public abstract void startEngine();

    public abstract void stopEngine();

    public abstract void drive();
}