class Vehicle {
  int maxSpeed;
  String fuelType;

  public Vehicle(int maxSpeed, String fuelType) {
    this.maxSpeed = maxSpeed;
    this.fuelType = fuelType;
  }

  public void displayInfo() {
    System.out.println("Max speed: " + maxSpeed);
    System.out.println("FuelType: " + fuelType);
  }

  public static void main(String[] args) {

    Vehicle[] vehicles = new Vehicle[3];

    vehicles[0] = new Car(200, "Petrol", 5);
    vehicles[1] = new Truck(120, "Diesel", 10);
    vehicles[2] = new Motorcycle(180, "Petrol", false);

    for (Vehicle vehicle : vehicles) {
      vehicle.displayInfo();
      System.out.println();
    }
  }
}

class Car extends Vehicle {
  int seatCapacity;

  public Car(int maxSpeed, String fuelType, int seatCapacity) {
    super(maxSpeed, fuelType);
    this.seatCapacity = seatCapacity;
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("Seat Capacity: " + seatCapacity);
  }
}

class Truck extends Vehicle {
  double loadCapacity;

  public Truck(int maxSpeed, String fuelType, double loadCapacity) {
    super(maxSpeed, fuelType);
    this.loadCapacity = loadCapacity;
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("Load Capacity: " + loadCapacity + " tons");
  }
}

class Motorcycle extends Vehicle {
  boolean hasSidecar;

  public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
    super(maxSpeed, fuelType);
    this.hasSidecar = hasSidecar;
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
  }
}
