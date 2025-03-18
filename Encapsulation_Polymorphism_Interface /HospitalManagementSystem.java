import java.util.ArrayList;
import java.util.List;

// Interface for Medical Records
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

// Abstract class Patient
abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;
    private List<String> medicalRecords; // Encapsulation applied

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalRecords = new ArrayList<>();
    }

    public abstract double calculateBill(); // Abstract method

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
        System.out.println("Medical record added for " + name);
    }

    @Override
    public List<String> viewRecords() {
        return medicalRecords;
    }
}

// Subclass InPatient
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge + 500; // Base charge for InPatient
    }
}

// Subclass OutPatient
class OutPatient extends Patient {
    private double consultationFee;
    private double testCharges;

    public OutPatient(String patientId, String name, int age, double consultationFee, double testCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.testCharges = testCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFee + testCharges;
    }
}

// Main class to demonstrate polymorphism
public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient inPatient = new InPatient("P001", "John Doe", 45, 5, 2000);
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 30, 500, 1000);

        patients.add(inPatient);
        patients.add(outPatient);

        // Adding medical records
        inPatient.addRecord("Admitted for surgery.");
        outPatient.addRecord("Routine health checkup.");

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: $" + patient.calculateBill());
            System.out.println("Medical Records: " + patient.viewRecords());
            System.out.println("--------------------------------------");
        }
    }
}

