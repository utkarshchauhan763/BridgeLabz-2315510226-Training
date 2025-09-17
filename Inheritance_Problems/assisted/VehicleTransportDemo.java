// Vehicle and Transport System - Demonstrates inheritance, unique attributes, and polymorphism
// Best practices: private fields, @Override, clear documentation

abstract class Vehicle {
    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public int getMaxSpeed() { return maxSpeed; }
    public String getFuelType() { return fuelType; }

    public abstract void displayInfo();
}

class Car extends Vehicle {
    private int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo() {
        System.out.println("Car: Max Speed: " + getMaxSpeed() + ", Fuel: " + getFuelType() + ", Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int loadCapacity;
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo() {
        System.out.println("Truck: Max Speed: " + getMaxSpeed() + ", Fuel: " + getFuelType() + ", Load: " + loadCapacity + "kg");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasCarrier;
    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: Max Speed: " + getMaxSpeed() + ", Fuel: " + getFuelType() + ", Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

public class VehicleTransportDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 10000),
            new Motorcycle(150, "Petrol", true)
        };
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
