package assistedproblems.vehicletransportsystem;

class Truck extends Vehicle {
    private double loadCapacity;
    Truck(double maxSpeed, String fuelType, double loadCapacity){
        super(maxSpeed, fuelType);
        this.maxSpeed=maxSpeed;
        this.fuelType= fuelType;
        this.loadCapacity= loadCapacity;
    }

    void displayInfo(){
        System.out.println("Truck Details: ");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Load Capacity : " + loadCapacity);
    }
}