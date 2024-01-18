public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();

        // making 3 calls
        for (int i = 0; i < 3; i++)
            phone.call();

        // play a game twice
        phone.playGame();
        phone.playGame();

        // charge a phone
        phone.charge();

        phone.displayBattery();

    }

}
