package problemstatements.ridehailingapplication;

class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Not Available";
    }

    @Override
    public double calculateFare(double distance) {
         return getRatePerKm() * distance * 1.1; // Slightly higher fare for Auto rides
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}