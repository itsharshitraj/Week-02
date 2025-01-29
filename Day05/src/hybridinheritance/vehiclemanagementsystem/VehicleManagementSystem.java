package hybridinheritance.vehiclemanagementsystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create objects for ElectricVehicle and PetrolVehicle
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display information and demonstrate functionality
        System.out.println("Vehicle Details:");
        ev.displayInfo();
        ev.charge();
        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}
