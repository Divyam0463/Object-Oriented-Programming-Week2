import java.util.ArrayList;
import java.util.List;

// Interface for Insurance
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class Vehicle
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;
    private String insurancePolicyNumber; // Encapsulation applied

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05; // Example insurance calculation
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

    public String getVehicleInfo() {
        return "Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: $" + rentalRate;
    }
}

// Subclass Car
class Car extends Vehicle {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}

// Subclass Bike
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}

// Subclass Truck
class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.2; // Extra charge for trucks
    }
}

// Main class to demonstrate polymorphism
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 50, "INS12345"));
        vehicles.add(new Bike("BIKE456", 20, "INS67890"));
        vehicles.add(new Truck("TRUCK789", 100, "INS54321"));

        int rentalDays = 5;
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleInfo());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + v.calculateRentalCost(rentalDays));
            System.out.println("Insurance Cost: $" + v.calculateInsurance());
            System.out.println(v.getInsuranceDetails());
            System.out.println("--------------------------------------");
        }
    }
}
