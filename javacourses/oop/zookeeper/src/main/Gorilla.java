package main;

public class Gorilla extends Mammal {

    public void throwSomething() {
        int n = this.getEnergy();
        this.setEnergy(n - 5);
        System.out.println("The gorilla threw something");

    }

    public void eatBananas() {
        int n = this.getEnergy();
        this.setEnergy(n + 10);
        System.out.println("The gorilla is eating Bananas");
    }

    public void climb() {
        int n = this.getEnergy();
        this.setEnergy(n - 10);
        System.out.println("The gorilla is climbing");
    }

}
