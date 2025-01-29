package problemstatements.ridehailingapplication;


    class Car extends Vehicle implements GPS {
        private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
            super(vehicleId, driverName, ratePerKm);
            this.currentLocation = "Not Available";
        }

        @Override
        public double calculateFare(double distance) {
            return getRatePerKm() * distance;
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


