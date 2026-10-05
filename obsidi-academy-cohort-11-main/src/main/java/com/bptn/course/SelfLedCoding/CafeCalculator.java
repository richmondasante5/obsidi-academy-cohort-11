package com.bptn.course.SelfLedCoding;

public class CafeCalculator {

    public static void main(String[] args) {

        // --- Step 1: Calculate revenue for coffee and pastries ---
        // You can change these numbers to match whatever sales data you have
        double coffeeRevenue = calculateItemRevenue(5.00, 20.0);
        double pastryRevenue = calculateItemRevenue(3.50, 15.0);

        // --- Step 2: Calculate the total daily revenue ---
        double totalRevenue = calculateDailyTotalRevenue(coffeeRevenue, pastryRevenue);

        // --- Step 3: Print out the results exactly as required ---
        System.out.println("Daily Coffee Revenue: $" + coffeeRevenue);
        System.out.println("Daily Pastry Revenue: $" + pastryRevenue);
        System.out.println("Total Daily Revenue: $" + totalRevenue);
    }

    // Custom method to calculate revenue for a specific item type
    public static double calculateItemRevenue(double pricePerItem, double numberOfItemsSold) {
        return pricePerItem * numberOfItemsSold;
    }

    // Custom method to calculate the total revenue for the day
    public static double calculateDailyTotalRevenue(double coffeeRevenue, double pastryRevenue) {
        return coffeeRevenue + pastryRevenue;
    }
}
