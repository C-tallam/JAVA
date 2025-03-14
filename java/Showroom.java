import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    // Fields to store vehicle details
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
    // Additional field for fuel type
    private String fuelType;

    // Constructor to initialize all fields, including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call the base class constructor
        this.fuelType = fuelType;
    }

    // Override the displayDetails method to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the base class method
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Class Showroom to interact with the user
class Showroom {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for car details
        System.out.print("Enter the brand of the car: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year of the car: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the fuel type of the car: ");
        String fuelType = scanner.nextLine();

        // Instantiate a Car object with user-provided data
        Car car = new Car(brand, model, year, fuelType);

        // Display the car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        // Close the scanner
        scanner.close();
    }
}