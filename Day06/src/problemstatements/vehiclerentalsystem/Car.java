package problemstatements.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Rate is 15% of Daily Rental Rate";
    }

    // Display details
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Insurance policy Number: " + insurancePolicyNumber);
    }
}
