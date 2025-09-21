import java.util.ArrayList;
import java.util.List;

public class HospitalDoctorsPatients {

    public static class Hospital {
        private String name;
        private List<Doctor> doctors;
        private List<Patient> patients;

        public Hospital(String name) {
            this.name = name;
            this.doctors = new ArrayList<>();
            this.patients = new ArrayList<>();
        }

        public void addDoctor(Doctor doctor) {
            doctors.add(doctor);
        }

        public void addPatient(Patient patient) {
            patients.add(patient);
        }
    }

    public static class Doctor {
        private String name;
        private List<Patient> patients;

        public Doctor(String name) {
            this.name = name;
            this.patients = new ArrayList<>();
        }

        public void consult(Patient patient) {
            if (!patients.contains(patient)) {
                patients.add(patient);
            }
            System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        }
    }

    public static class Patient {
        private String name;
        private List<Doctor> doctors;

        public Patient(String name) {
            this.name = name;
            this.doctors = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addDoctor(Doctor doctor) {
            if (!doctors.contains(doctor)) {
                doctors.add(doctor);
            }
        }
    }
}
