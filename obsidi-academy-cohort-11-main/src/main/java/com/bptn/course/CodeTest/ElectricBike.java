package com.bptn.course.CodeTest;

// ElectricBike inherits from Vehicle and follows the ElectricPowered contract
public class ElectricBike extends Vehicle implements ElectricPowered {

    // Battery level specific to ElectricBike
    double batteryLevel = 75.0;

    // Constructor
    public ElectricBike(String make, String model, int year) {
        // Call the parent Vehicle constructor
        super(make, model, year);
    }

    // Start the electric bike
    @Override
    public void startEngine() {
        isEngineOn = true;
        System.out.println("Electric bike started.");
    }

    // Stop the electric bike
    @Override
    public void stopEngine() {
        isEngineOn = false;
        System.out.println("Electric bike stopped.");
    }

    // Drive the electric bike
    @Override
    public void drive() {
        System.out.println("Electric bike is moving.");
    }

    // Add charge to the battery
    @Override
    public void charge(double kWh) {
        batteryLevel += kWh;
        System.out.println("Electric bike charged.");
    }

    // Return current battery level
    @Override
    public double getBatteryLevel() {
        return batteryLevel;
    }
}