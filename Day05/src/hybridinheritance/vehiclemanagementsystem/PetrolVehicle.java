package hybridinheritance.vehiclemanagementsystem;


// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity; // Fuel tank capacity in liters

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementation of refuel() method
    @Override
    public void refuel() {
        System.out.println(model + " is being refueled. Tank capacity: " + fuelTankCapacity + " liters.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}
