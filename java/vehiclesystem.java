class Vehicle {
    protected String brand;
    protected int speed;
       public Vehicle(String brand, int speed) {   this.brand = brand;
  this.speed = speed;
    }
    
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " accelerated by " + increase + " km/h. New speed: " + speed);
    }
    
    public void brake(int decrease) {
        speed = Math.max(0, speed - decrease);
        System.out.println(brand + " slowed down by " + decrease + " km/h. New speed: " + speed);
    }
    
    public void showDetails() {
        System.out.println("Vehicle: " + brand + " | Speed: " + speed);
    }
}

class Car extends Vehicle {
    private int fuelLevel;
    
    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }
    
    public void refuel(int amount) {
        fuelLevel = Math.min(100, fuelLevel + amount);
        System.out.println(brand + " refueled by " + amount + "%. New fuel level: " + fuelLevel + "%");
    }
    
    @Override
    public void showDetails() {
        System.out.println("Car: " + brand + " | Speed: " + speed + " | Fuel Level: " + fuelLevel + "%");
    }
}

class Bike extends Vehicle {
    private boolean helmetOn;    
    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }
       public void wearHelmet() {
        helmetOn = true;
        System.out.println(brand + " rider is now wearing a helmet.");
    }
    
    @Override
    public void showDetails() {
        System.out.println("Bike: " + brand + " | Speed: " + speed + " | Helmet On: " + helmetOn);
    }
}

public class vehiclesystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 60, 50);
        Bike bike = new Bike("Yamaha", 40, false);
        
        car.accelerate(20);
        car.brake(30);
        car.refuel(30);
        car.showDetails();
        
        bike.accelerate(15);
        bike.brake(10);
        bike.wearHelmet();
        bike.showDetails();
    }
}
