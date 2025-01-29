package problemstatements.vehiclerentalsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        Car car = new Car("BR31AK5547", "SUV", 400, "AK5547");
        vehicles.add(car);

        Bike bike = new Bike("BR31AK5367", "Commuter", 200, "jfefjgeyhg");
        vehicles.add(bike);

        Truck truck = new Truck("BR31AK8574", "Tipper", 10000, "hfgvfherve");
        vehicles.add(truck);

        System.out.println("Display vehicle Details");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicleDetails();

            int rentalDays = 7;
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days : $ " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                double insuranceCost = insurable.calculateInsurance();
                System.out.println("Insurance Cost: " + insuranceCost);
                System.out.println(insurable.getInsuranceDetails());
            }
            System.out.println("--------------");
        }
    }
}
