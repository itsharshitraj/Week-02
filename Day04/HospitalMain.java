import java.util.ArrayList;

// Hospital Class
class Hospital {
    private String name;
    private ArrayList<Doctor> doctors; // Association with Doctor
    private ArrayList<Patient> patients; // Association with Patient
	
    // Constructor to initialize the hospital with a name
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
	}
	
    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
	}
	
    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
	}
	
    // Display details of doctors and patients in the hospital
    public void displayHospitalDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
		}
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
		}
	}
}

// Doctor Class
class Doctor {
    private String name;
    private ArrayList<Patient> patients; // Association with Patient
	
    // Constructor to initialize doctor with a name
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
	}
	
    // Method for a doctor to consult a patient
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting with Patient " + patient.getName());
        if (!patients.contains(patient)) {
            patients.add(patient); // Add the patient to the doctor's list of patients
		}
	}
	
    // Get the doctor's name
    public String getName() {
        return name;
	}
	
    // Method to display the patients consulted by the doctor
    public void displayPatients() {
        System.out.println("Doctor " + name + "'s Patients:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
		}
	}
}

// Patient Class
class Patient {
    private String name;
    private ArrayList<Doctor> doctors; // Association with Doctor
	
    // Constructor to initialize patient with a name
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
	}
	
    // Get the patient's name
    public String getName() {
        return name;
	}
	
    // Method for a patient to consult with a doctor
    public void consultWithDoctor(Doctor doctor) {
        System.out.println("Patient " + name + " is consulting with Doctor " + doctor.getName());
        if (!doctors.contains(doctor)) {
            doctors.add(doctor); // Add the doctor to the patient's list of doctors
		}
	}
	
    // Method to display the doctors consulted by the patient
    public void displayDoctors() {
        System.out.println("Patient " + name + "'s Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
		}
	}
}

// Main Class to simulate the hospital system
public class HospitalMain {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");
		
        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");
		
        // Create patients
        Patient patient1 = new Patient("John Doe");
        Patient patient2 = new Patient("Jane Smith");
		
        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
		
        // Display hospital details
        hospital.displayHospitalDetails();
		
        // Simulate consultations
        doctor1.consult(patient1);  // Dr. Smith consults John Doe
        doctor2.consult(patient1);  // Dr. Johnson consults John Doe
        doctor1.consult(patient2);  // Dr. Smith consults Jane Smith
        patient1.consultWithDoctor(doctor2);  // John Doe consults Dr. Johnson
		
        // Display details after consultations
        doctor1.displayPatients();
        doctor2.displayPatients();
        patient1.displayDoctors();
        patient2.displayDoctors();
	}
}