public class Car {
    private String licensePlate;
    private boolean isRented;

    // Constructor to set the license plate when a car is created
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false; // By default, the car is not rented
    }

    // Method to rent the car only if it is available
    public void rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car with license plate " + licensePlate + " has been rented.");
        } else {
            System.out.println("Car with license plate " + licensePlate + " is already rented.");
        }
    }

    // Method to return the car and mark it as available
    public void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println("Car with license plate " + licensePlate + " has been returned.");
        } else {
            System.out.println("Car with license plate " + licensePlate + " is already available.");
        }
    }

    // Getter method to check if the car is rented
    public boolean isCarRented() {
        return isRented;
    }

    public static void main(String[] args) {
        Car car1 = new Car("KDK 238H");

        // Try to rent the car
        car1.rentCar();

        // Try to rent the car again (should fail)
        car1.rentCar();

        // Return the car
        car1.returnCar();

        // Check if the car is rented
        System.out.println("Is car rented? " + car1.isCarRented());
    }
}