package com.bptn.course.CodeTest;

// Interface for vehicles that use electricity
public interface ElectricPowered {

    // Requires the vehicle to provide a charging method
    void charge(double kWh);

    // Requires the vehicle to return its battery level
    double getBatteryLevel();
}