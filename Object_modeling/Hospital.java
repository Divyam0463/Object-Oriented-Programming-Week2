import java.util.ArrayList;

class Hospital {
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor
    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display all doctors and patients in the hospital
    public void displayHospital() {
        System.out.println("Hospital Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }

        System.out.println("Hospital Patients:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Adams");

        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Display all doctors and patients
        hospital.displayHospital();

        // Simulate consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);

        doctor2.consult(patient1);
    }
}

class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Consulting
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient); // Add patient to doctor's list if not already added
        }
        System.out.println(name + " is consulting with " + patient.getName());
        patient.receiveConsultation(this);
    }
}

class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Receive consultation from a doctor
    public void receiveConsultation(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
        System.out.println(name + " is being treated by " + doctor.getName());
    }
}