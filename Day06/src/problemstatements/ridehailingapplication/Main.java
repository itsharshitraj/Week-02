package problemstatements.ridehailingapplication;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("C001", "John Doe", 10.0);
        Vehicle bike = new Bike("B001", "Jane Smith", 5.0);
        Vehicle auto = new Auto("A001", "Bob Brown", 8.0);

        // Update and display locations
        if (car instanceof GPS) {
            ((GPS) car).updateLocation("Downtown");
        }
        if (bike instanceof GPS) {
            ((GPS) bike).updateLocation("Central Park");
        }
        if (auto instanceof GPS) {
            ((GPS) auto).updateLocation("Airport");
        }

        // Create a list of vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Calculate and display fares dynamically
        double distance = 15.0; // Example distance
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();

            if (vehicle instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            }

            double fare = vehicle.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: $" + fare);
            System.out.println("----------------------");
        }
    }
}
