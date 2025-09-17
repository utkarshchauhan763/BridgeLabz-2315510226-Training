// Vehicle Rental System - Hierarchical Inheritance Example
// Best practices: encapsulation, abstract class, interface, polymorphism

/**
 * Abstract class representing a generic Vehicle.
 */
abstract class Vehicle {
    private final String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public void setType(String type) {
        if (type == null || type.isEmpty()) throw new IllegalArgumentException("Type cannot be empty");
        this.type = type;
    }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) {
        if (rentalRate < 0) throw new IllegalArgumentException("Rental rate cannot be negative");
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

/**
 * Interface for insurable vehicles.
 */
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

/**
 * Car implementation.
 */
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

/**
 * Bike implementation.
 */
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8; // 20% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}

/**
 * Truck implementation.
 */
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // 50% surcharge for trucks
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}

/**
 * Demo for polymorphic vehicle processing.
 */
public class VehicleRentalDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
            new Car("CAR123", 2000, "CAR-INS-001"),
            new Bike("BIKE456", 500, "BIKE-INS-002"),
            new Truck("TRUCK789", 4000, "TRUCK-INS-003")
        };
        int days = 5;
        for (Vehicle v : vehicles) {
            double rental = v.calculateRentalCost(days);
            double insurance = ((Insurable)v).calculateInsurance();
            System.out.println(v.getType() + " Rental for " + days + " days: " + rental);
            System.out.println("Insurance: " + insurance);
            System.out.println(((Insurable)v).getInsuranceDetails());
            System.out.println();
        }
    }
}
