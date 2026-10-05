package com.bptn.course.CodeTest;

// Car inherits from Vehicle and follows the FuelConsuming contract
public class Car extends Vehicle implements FuelConsuming {

    // Fuel level specific to Car
    double fuelLevel = 50.0;

    // Constructor
    public Car(String make, String model, int year) {
        // Call the parent Vehicle constructor
        super(make, model, year);
    }

    // Start the car engine
    @Override
    public void startEngine() {
        isEngineOn = true;
        System.out.println("Car engine started.");
    }

    // Stop the car engine
    @Override
    public void stopEngine() {
        isEngineOn = false;
        System.out.println("Car engine stopped.");
    }

    // Drive the car
    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }

    // Add fuel to the car
    @Override
    public void refuel(double liters) {
        fuelLevel += liters;
        System.out.println("Car refueled.");
    }

    // Return current fuel level
    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}