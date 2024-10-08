package RoadAccidentDemo;

import java.util.Scanner;

// Abstract class that implements the IRoadAccidents interface
public abstract class RoadAccidents implements IRoadAccidents 
{
    // Scanner object for user input
    protected Scanner keyboard = new Scanner(System.in);
    
    // Variables to store accident data
    protected String vehicleType;
    protected String cityName;
    protected int accidentTotal;

    // Method to collect accident data
    public void collectAccidentData() 
    {
        // Get vehicle type, city, and total accidents from user
        getAccidentVehicleType();
        getCity();
        getAccidentTotal();
        
        // Display the collected report
        displayReport();
    }

    @Override
    public String getAccidentVehicleType() 
    {
        // Prompt user for vehicle type
        System.out.print("Enter the accident vehicle type: ");
        vehicleType = keyboard.nextLine();
        return vehicleType;
    }

    @Override
    public String getCity() 
    {
        // Prompt user for city name
        System.out.print("Enter the city for the vehicle accident: ");
        cityName = keyboard.nextLine();
        return cityName;
    }

    @Override
    public int getAccidentTotal() 
    {
        // Prompt user for total accidents
        System.out.print("Enter the total " + vehicleType + " accidents for " + cityName + ": ");
        accidentTotal = keyboard.nextInt();
        return accidentTotal;
    }

    // Method to display the accident report
    protected void displayReport() 
    {
        System.out.println();
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("**********************************");
        System.out.println("VEHICLE TYPE: " + vehicleType);
        System.out.println("CITY: " + cityName);
        System.out.println("TOTAL ACCIDENTS: " + accidentTotal);
        System.out.println("**********************************");
    }
}
