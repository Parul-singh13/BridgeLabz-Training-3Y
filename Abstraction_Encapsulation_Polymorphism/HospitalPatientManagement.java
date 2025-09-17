import java.util.*;

// Interface for Medical Records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract class Patient
abstract class Patient implements MedicalRecord {
    protected String patientId;
    protected String name;
    protected int age;

    // Encapsulation: sensitive data is private
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getter for diagnosis (controlled access)
    public String getDiagnosis() {
        return diagnosis;
    }

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    // Abstract method for billing
    public abstract double calculateBill();

    // MedicalRecord methods
    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + name + ":");
        if (medicalHistory.isEmpty()) {
            System.out.println("No records available.");
        } else {
            for (String record : medicalHistory) {
                System.out.println("- " + record);
            }
        }
    }
}

// Subclass InPatient
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}

// Subclass OutPatient
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

// Main class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        // Create InPatient
        InPatient p1 = new InPatient("P001", "Riya", 35, "Pneumonia", 5, 2000);
        p1.addRecord("Admitted to General Ward");
        p1.addRecord("Prescribed Antibiotics");

        // Create OutPatient
        OutPatient p2 = new OutPatient("P002", "Raj", 42, "Fever", 500);
        p2.addRecord("Consultation with Dr. Smith");
        p2.addRecord("Blood Test recommended");

        patients.add(p1);
        patients.add(p2);

        // Polymorphism in action
        for (Patient patient : patients) {
            patient.getPatientDetails();
            patient.viewRecords();
            System.out.println("Total Bill: " + patient.calculateBill());
        
        }
    }
}
