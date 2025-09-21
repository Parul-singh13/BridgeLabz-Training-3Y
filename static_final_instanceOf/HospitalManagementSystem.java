public class HospitalManagementSystem {

    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    public HospitalManagementSystem(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment + ", Hospital: " + hospitalName);
    }

    public static void main(String[] args) {
        HospitalManagementSystem patient1 = new HospitalManagementSystem(301, "John Doe", 45, "Flu");
        HospitalManagementSystem patient2 = new HospitalManagementSystem(302, "Jane Smith", 30, "Fracture");

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        System.out.println("Total Patients: " + getTotalPatients());

        Object obj = patient1;
        if (obj instanceof HospitalManagementSystem) {
            System.out.println("Object is an instance of HospitalManagementSystem");
        }
    }
}
