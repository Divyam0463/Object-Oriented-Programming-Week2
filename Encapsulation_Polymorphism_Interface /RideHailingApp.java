import java.util.Random;

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm; // Accessible in subclasses
    private String currentLocation; // Encapsulation applied

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    public abstract double calculateFare(double distance); // Abstract method

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate: $" + ratePerKm + "/km";
    }

    @Override
    public String getCurrentLocation() {
        return "Current Location: " + currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println(driverName + "'s location updated to: " + newLocation);
    }
}

// Subclass Car
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 10; // Base charge for Car rides
    }
}

// Subclass Bike
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm; // No base charge for Bike rides
    }
}

// Subclass Auto
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 5; // Small base charge for Auto rides
    }
}

// Main class to demonstrate polymorphism
public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", "John Doe", 12, "Downtown");
        Vehicle bike = new Bike("BIKE456", "Alice Smith", 8, "Mall Road");
        Vehicle auto = new Auto("AUTO789", "Bob Johnson", 10, "City Center");

        Vehicle[] rides = {car, bike, auto};
        double distance = new Random().nextInt(10) + 1; // Random distance between 1 and 10 km

        for (Vehicle ride : rides) {
            System.out.println(ride.getVehicleDetails());
            System.out.println(ride.getCurrentLocation());
            System.out.println("Fare for " + distance + " km: $" + ride.calculateFare(distance));
            ride.updateLocation("New Destination " + distance);
            System.out.println("--------------------------------------");
        }
    }
}

