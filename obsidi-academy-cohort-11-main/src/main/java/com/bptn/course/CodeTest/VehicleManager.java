package com.bptn.course.CodeTest;

public class VehicleManager {

    public static void main(String[] args) {

        // Create a Car object
        Car myCar = new Car("Honda", "Civic", 2023);

        // Test Car methods
        myCar.displayBasicInfo();
        myCar.startEngine();
        myCar.drive();
        myCar.refuel(20.0);
        System.out.println("Fuel Level: " + myCar.getFuelLevel());
        myCar.stopEngine();

        System.out.println("--------------------");

        // Create an ElectricBike object
        ElectricBike myBike = new ElectricBike("Trek", "E-Caliber", 2024);

        // Test ElectricBike methods
        myBike.displayBasicInfo();
        myBike.startEngine();
        myBike.drive();
        myBike.charge(10.0);
        System.out.println("Battery Level: " + myBike.getBatteryLevel());
        myBike.stopEngine();

        System.out.println("--------------------");

        // Polymorphism using the FuelConsuming interface
        FuelConsuming fuelVehicle = myCar;

        fuelVehicle.refuel(10.0);
        System.out.println("Fuel Level: " + fuelVehicle.getFuelLevel());

        // Polymorphism using the ElectricPowered interface
        ElectricPowered electricVehicle = myBike;

        electricVehicle.charge(5.0);
        System.out.println("Battery Level: " + electricVehicle.getBatteryLevel());
    }
}