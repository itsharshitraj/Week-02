class Vehicle {
    // Static variable for the registration fee, common for all vehicles
    private static double registrationFee = 500.0;
	
    // Final variable to uniquely identify each vehicle
    private final String registrationNumber;
	
    // Instance variables
    private String ownerName;
    private String vehicleType;
	
    // Constructor
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        // Using 'this' to initialize instance variables
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
	}
	
    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
	}
	
    // Static method to display the current registration fee
    public static void displayRegistrationFee() {
        System.out.println("Current Registration Fee: $" + registrationFee);
	}
	
    // Method to display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Using 'instanceof' to validate object type
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: $" + registrationFee);
			} else {
            System.out.println("The object is not an instance of the Vehicle class.");
		}
	}
	
    // Main method to test the Vehicle class
    public static void main(String[] args) {
	// Display the initial registration fee
	Vehicle.displayRegistrationFee();
	
	// Create Vehicle objects
	Vehicle vehicle1 = new Vehicle("REG123", "Alice", "Car");
	Vehicle vehicle2 = new Vehicle("REG456", "Bob", "Motorbike");
	
	// Display details of vehicles
	System.out.println("\nVehicle 1 Details:");
	vehicle1.displayVehicleDetails();
	
	System.out.println("\nVehicle 2 Details:");
	vehicle2.displayVehicleDetails();
	
	// Update the registration fee
	System.out.println("\nUpdating Registration Fee:");
	Vehicle.updateRegistrationFee(750.0);
	
	// Display details again after fee update
	System.out.println("\nVehicle 1 Details After Fee Update:");
	vehicle1.displayVehicleDetails();
	
	System.out.println("\nVehicle 2 Details After Fee Update:");
	vehicle2.displayVehicleDetails();
	
	// Instanceof demonstration
	System.out.println("\nInstanceof Check:");
	if (vehicle1 instanceof Vehicle) {
	System.out.println("vehicle1 is an instance of the Vehicle class.");
	} else {
	System.out.println("vehicle1 is not an instance of the Vehicle class.");
	}
    }
	}
		