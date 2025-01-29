package hybridinheritance.vehiclemanagementsystem;


// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // Battery capacity in kWh

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println(model + " is being charged. Battery capacity: " + batteryCapacity + " kWh.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}