package assistedproblems.vehicletransportsystem;

class Motorcycle extends Vehicle {
    private String bikeType;

    Motorcycle(double maxSpeed, String fuelType, String bikeType){
        super(maxSpeed, fuelType);
        this.maxSpeed=maxSpeed;
        this.fuelType= fuelType;
        this.bikeType=bikeType;

    }

    void displayInfo(){
        System.out.println("Motorcycle Details: ");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Bike Type : " + bikeType);
    }
}
