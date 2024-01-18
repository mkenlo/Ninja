package main;

public class Mammal {
	private int energy;

	public Mammal() {
		energy = 100;
	}

	/**
	 * @return int return the energy
	 */
	public int getEnergy() {
		return energy;
	}

	/**
	 * @param energy the energy to set
	 */
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void displayEnergy() {
		if (energy < 0) {
			System.out.println("Energy Level: DIED! ");
		} else
			System.out.println("Energy Level: " + energy);
	}

}
