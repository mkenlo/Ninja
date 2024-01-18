public class Device {
    private int battery;

    public Device() {
        battery = 100;
    }

    /**
     * @return int return the battery
     */
    public int getBattery() {
        return battery;
    }

    /**
     * @param battery the battery to set
     */
    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void displayBattery() {
        System.out.println("Battery Level: " + this.battery + "%");
    }

}
