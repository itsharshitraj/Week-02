package problemstatements.hospitalpatientmanagement;

public class Main {
    public static void main(String[] args) {
        // Create patients
        Patient inPatient = new InPatient("P001", "John Doe", 45, 200.0, 5);
        Patient outPatient = new OutPatient("P002", "Jane Smith", 30, 100.0);

        // Add medical records
        if (inPatient instanceof MedicalRecord) {
            ((MedicalRecord) inPatient).addRecord("Admitted for surgery");
            ((MedicalRecord) inPatient).addRecord("Underwent knee replacement");
        }

        if (outPatient instanceof MedicalRecord) {
            ((MedicalRecord) outPatient).addRecord("Consulted for flu symptoms");
            ((MedicalRecord) outPatient).addRecord("Prescribed medication for 7 days");
        }

        // Process and display patient details and billing
        Patient[] patients = {inPatient, outPatient};

        for (Patient patient : patients) {
            patient.getPatientDetails();

            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }

            double bill = patient.calculateBill();
            System.out.println("Total Bill: $" + bill);
            System.out.println("----------------------");
        }
    }
}
