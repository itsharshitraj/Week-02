package assistedproblems.vehicletransportsystem;

class Vehicle {
    protected double maxSpeed;
    protected String fuelType;


    Vehicle(double maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }


    // method to display details
    void displayInfo(){
        System.out.println("Vehicle info: ");
        System.out.println("Max Speed: " + maxSpeed + "km/h");
        System.out.println("Fuel Type: " + fuelType);

    }
}