class Patient {
    // Static variable for hospital name shared by all patients
    private static String hospitalName = "City Hospital";
	
    // Static variable to count the total number of patients
    private static int totalPatients = 0;
	
    // Final variable to uniquely identify each patient
    private final int patientID;
	
    // Instance variables
    private String name;
    private int age;
    private String ailment;
	
    // Constructor
    public Patient(int patientID, String name, int age, String ailment) {
        // Using 'this' to initialize instance variables
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
		
        // Increment the total number of patients
        totalPatients++;
	}
	
    // Static method to display the total number of patients admitted
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
	}
	
    // Static method to display the hospital name
    public static void displayHospitalName() {
        System.out.println("Hospital Name: " + hospitalName);
	}
	
    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) { // Using 'instanceof' to validate object type
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
		System.out.println("Ailment: " + ailment);
		System.out.println("Hospital: " + hospitalName);
        } else {
		System.out.println("The object is not an instance of the Patient class.");
        }
		}
		
		// Main method to test the Patient class
		public static void main(String[] args) {
        // Display the hospital name
        Patient.displayHospitalName();
		
        // Create Patient objects
        Patient patient1 = new Patient(101, "Alice", 30, "Flu");
        Patient patient2 = new Patient(102, "Bob", 45, "Diabetes");
		
        // Display details of patients
        System.out.println("\nPatient 1 Details:");
        patient1.displayPatientDetails();
		
        System.out.println("\nPatient 2 Details:");
        patient2.displayPatientDetails();
		
        // Display the total number of patients
        System.out.println("\nTotal Patients:");
        Patient.getTotalPatients();
		
        // Instanceof demonstration
        System.out.println("\nInstanceof Check:");
        if (patient1 instanceof Patient) {
		System.out.println("patient1 is an instance of the Patient class.");
        } else {
		System.out.println("patient1 is not an instance of the Patient class.");
        }
		}
		}
				