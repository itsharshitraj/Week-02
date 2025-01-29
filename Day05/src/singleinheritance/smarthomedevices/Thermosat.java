package singleinheritance.smarthomedevices;

class Thermosat extends Device {
    private int temperatureSetting;

    Thermosat(String deviceId, String deviceStatus, int temperatureSetting){
        super(deviceId, deviceStatus );
        this.temperatureSetting=temperatureSetting;

    }

    // method to display info
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the superclass method to display book details
        System.out.println("Temperature Setting: " + temperatureSetting + " Degree celsius");

    }

}