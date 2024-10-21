# Road Accident Demo

## Overview

The Road Accident Demo is a simple Java application designed to collect and display information about road accidents. It allows users to input data regarding the type of vehicle involved in accidents, the city where the accidents occurred, and the total number of accidents. The program then displays a summary report of the collected information.

## Features

- Collects data on vehicle type, city name, and total accidents.
- Displays a formatted report summarizing the collected data.

## Architecture

The application consists of the following components:

1. **IRoadAccidents Interface**: Defines methods for retrieving accident data.
   - `String getAccidentVehicleType()`
   - `String getCity()`
   - `int getAccidentTotal()`

2. **RoadAccidents Abstract Class**: Implements the `IRoadAccidents` interface and handles user input.
   - Uses a `Scanner` object for reading user input.
   - Contains methods to collect accident data and display the report.

3. **RoadAccidentReport Class**: The main class that initiates the application.
   - Creates an instance of `RoadAccidents` and starts the data collection process.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A Java IDE or text editor to edit the source code (e.g., IntelliJ IDEA, Eclipse, or VSCode).

### Running the Application

1. Clone the repository or download the source code files.
2. Open the project in your preferred Java IDE.
3. Compile the Java files.
4. Run the `RoadAccidentReport` class to start the application.

### Example Usage

When you run the application, it prompts you to enter:

- The type of vehicle involved in the accident (e.g., "Car", "Truck").
- The city where the accident occurred (e.g., "New York").
- The total number of accidents for that vehicle type in the specified city.

After inputting the data, the application will display a report with the information provided.

### Sample Output

```
Enter the accident vehicle type: Car
Enter the city for the vehicle accident: New York
Enter the total Car accidents for New York: 150

VEHICLE ACCIDENT REPORT
**********************************
VEHICLE TYPE: Car
CITY: New York
TOTAL ACCIDENTS: 150
**********************************
```

## Contribution

Contributions to improve the application are welcome! Please feel free to submit pull requests or open issues for discussion.
