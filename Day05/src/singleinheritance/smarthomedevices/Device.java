package singleinheritance.smarthomedevices;

class Device{
    protected String deviceId;
    protected String deviceStatus;

    Device(String deviceId, String deviceStatus){
        this.deviceId = deviceId;
        this.deviceStatus = deviceStatus;

    }
    // method to display info
    public void displayStatus() {
        System.out.println("Device Id: " + deviceId);
        System.out.println("Device Status: " + deviceStatus);
    }
}