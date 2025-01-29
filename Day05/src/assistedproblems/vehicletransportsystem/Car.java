package assistedproblems.vehicletransportsystem;

class Car extends Vehicle {
    private int seatCapacity;

    Car(double maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.maxSpeed=maxSpeed;
        this.fuelType= fuelType;
        this.seatCapacity=seatCapacity;

    }
    void displayInfo() {
        System.out.println("Car Details: ");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seat Capacity : " + seatCapacity);

    }
}