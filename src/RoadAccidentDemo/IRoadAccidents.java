package RoadAccidentDemo;

// Interface for road accident data methods
public interface IRoadAccidents 
{
    // Method to get the type of vehicle involved in the accident
    String getAccidentVehicleType();
    
    // Method to get the city name where the accident occurred
    String getCity();
    
    // Method to get the total number of accidents
    int getAccidentTotal();
}
