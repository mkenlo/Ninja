public class Phone extends Device {
    public void call() {
        System.out.println("making a call");
        int batteryLevel = this.getBattery();
        this.setBattery(batteryLevel - 5);
    }

    public void playGame() {
        int batteryLevel = this.getBattery();
        if (batteryLevel < 25) {
            System.out.println("Battery level low...cannot launch game");
        } else {
            this.setBattery(batteryLevel - 20);
            System.out.println("You play a game");
            System.out.println("Battery remaining: " + this.getBattery());
        }

    }

    public void charge() {
        System.out.println("charging phone now");
        int batteryLevel = this.getBattery();
        this.setBattery(batteryLevel + 50);
    }
}
