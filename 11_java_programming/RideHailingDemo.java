// Ride-Hailing Application - Hierarchical Inheritance Example
// Best practices: encapsulation, abstract class, interface, polymorphism

/**
 * Abstract class representing a generic Vehicle for ride-hailing.
 */
abstract class Vehicle {
    private final String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) {
        if (driverName == null || driverName.isEmpty()) throw new IllegalArgumentException("Driver name cannot be empty");
        this.driverName = driverName;
    }
    public double getRatePerKm() { return ratePerKm; }
    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm < 0) throw new IllegalArgumentException("Rate per km cannot be negative");
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm;
    }
}

/**
 * Interface for GPS functionality.
 */
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

/**
 * Car implementation.
 */
class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

/**
 * Bike implementation.
 */
class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8; // 20% discount for bikes
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

/**
 * Auto implementation.
 */
class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.2; // 20% surcharge for autos
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

/**
 * Demo for polymorphic ride fare calculation.
 */
public class RideHailingDemo {
    public static void main(String[] args) {
        Vehicle[] rides = new Vehicle[] {
            new Car("CAR001", "Amit", 15),
            new Bike("BIKE002", "Priya", 10),
            new Auto("AUTO003", "Ravi", 12)
        };
        double distance = 8.5; // km
        for (Vehicle v : rides) {
            ((GPS)v).updateLocation("Pickup Point");
            System.out.println(v.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS)v).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            System.out.println();
        }
    }
}
