package singleinheritance.smarthomedevices;

public class SmartHomeDevices {
    public static void main(String[] args) {
        // thermosat OBJECT
        Thermosat thermosat1 = new Thermosat("TH-01","Working",20);
        thermosat1.displayStatus();

        Thermosat thermosat2 = new Thermosat("TH-05","Working",30);
        thermosat2.displayStatus();
    }
}
