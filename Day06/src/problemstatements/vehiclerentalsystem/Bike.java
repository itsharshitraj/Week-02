package problemstatements.vehiclerentalsystem;

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Rate is 10% of Daily Rental Rate";
    }

    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Insurance policy Number: " + insurancePolicyNumber);
    }
}

