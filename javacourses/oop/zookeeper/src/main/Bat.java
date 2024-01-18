package main;

public class Bat extends Mammal {

    public Bat() {
        this.setEnergy(300);
    }

    public void fly() {
        int n = this.getEnergy();
        this.setEnergy(n - 50);
        System.out.println("The bat is flying");
    }

    public void eatHumans() {
        int n = this.getEnergy();
        this.setEnergy(n + 25);
        System.out.println("The bat is eating");
    }

    public void attackTown() {
        int n = this.getEnergy();
        this.setEnergy(n - 100);
        System.out.println("The bat attacked");
    }
}
