interface Refuelable {
  void refuel();
}

class Vehicle {
  String model;
  int maxSpeed;

  public Vehicle(String model, int maxSpeed) {
      this.model = model;
      this.maxSpeed = maxSpeed;
  }

  public void displayDetails() {
      System.out.println("Model: " + model);
      System.out.println("Max Speed: " + maxSpeed + " km/h");
  }
}

class ElectricVehicle extends Vehicle {
  int batteryCapacity;

  public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
      super(model, maxSpeed);
      this.batteryCapacity = batteryCapacity;
  }

  public void charge() {
      System.out.println("Charging the electric vehicle. Battery capacity: " + batteryCapacity + " kWh");
  }
}

class PetrolVehicle extends Vehicle implements Refuelable {
  int fuelCapacity;

  public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
      super(model, maxSpeed);
      this.fuelCapacity = fuelCapacity;
  }

  @Override
  public void refuel() {
      System.out.println("Refueling petrol vehicle. Fuel capacity: " + fuelCapacity + " liters");
  }
}

public class VehicleManagementSystem {
  public static void main(String[] args) {
      ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
      PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 250, 60);

      ev.displayDetails();
      ev.charge();
      System.out.println();

      pv.displayDetails();
      pv.refuel();
  }
}
