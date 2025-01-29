package assistedproblems.vehicletransportsystem;

public class VehicleTransportSystem {
    public static void main(String[] args) {

        Car car = new Car(220,"petrol",5);
        Truck truck = new Truck(120,"Diesel",1000);
        Motorcycle motorcycle = new Motorcycle(250,"Petrol","Sports");


        // stored in array of vehicle type
        Vehicle [] vehicles ={car, truck,motorcycle};

        System.out.println("Vehicle Information:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }



    }
}
