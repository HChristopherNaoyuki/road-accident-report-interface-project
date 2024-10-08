package RoadAccidentDemo;

// Main class to start the application
public class RoadAccidentReport 
{
    // Main method to execute the program
    public static void main(String[] args) 
    {
        // Create an instance of RoadAccidents
        RoadAccidents roadAccidents = new RoadAccidents() {};
        
        // Collect accident data from the user
        roadAccidents.collectAccidentData();
    }
}
