public class Vehicle {

  String ownerName;
  String vehicleType;
  static double registrationFee = 100.0; // truly-shared

  public Vehicle(String ownerName, String vehicleType) {
      this.ownerName = ownerName;
      this.vehicleType = vehicleType;
  }

  public void displayVehicleDetails() {
      System.out.println("Owner Name: " + ownerName);
      System.out.println("Vehicle Type: " + vehicleType);
      System.out.println("Registration Fee: " + registrationFee);
      System.out.println("--------------------");
  }

  public static void updateRegistrationFee(double newFee) {
      registrationFee = newFee;
      System.out.println("Registration fee updated to: " + registrationFee);
  }

  public static void main(String[] args) {
      Vehicle myVehicle = new Vehicle("John Doe", "Car");

      // initial 
      System.out.println("Initial Vehicle Details:");
      myVehicle.displayVehicleDetails();

      // Update (classname is used)
      Vehicle.updateRegistrationFee(150.0);

      // after update 
      System.out.println("\nVehicle Details after fee update:");
      myVehicle.displayVehicleDetails();


      Vehicle anotherVehicle = new Vehicle("Jane Smith", "Motorcycle"); 
      anotherVehicle.displayVehicleDetails(); // It has the updated fee too.
  }
}