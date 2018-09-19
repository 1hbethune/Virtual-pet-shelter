package VirtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	Map<String, VirtualPet> pets = new HashMap<>();

	private int currentHunger;
	private int currentThirst;
	private int currentWaste;
	private int currentBoredom;
	private int currentSickness;
	private int currentTiredness;
	private String name;
	private String description;

	public Shelter(int currentHunger, int currentThirst, int currentWaste, int currentBoredom, int currentSickness,
			int currentTiredness) {
		this.name = name;
		this.description = description;
		this.currentHunger = currentHunger;
		this.currentThirst = currentThirst;
		this.currentWaste = currentWaste;
		this.currentBoredom = currentBoredom;
		this.currentSickness = currentSickness;
		this.currentTiredness = currentTiredness;
	}

	public void add(VirtualPet pet) {
		pets.put(pet.getName(), pet);

	}

	public VirtualPet retrievePet(String name) {

		return pets.get(name);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public void close(VirtualPet pet) {
		pets.remove(pet.getName());

	}

	public void feedAll() {
		for (VirtualPet pet : pets.values()) {
			pet.feed(20);

		}
	}

	public void play(int currentThirst, int name) {
		for (VirtualPet pet : pets.values()) {
			pet.playWith(20);
		}

	}

	public void waterAll() {
		for (VirtualPet pet : pets.values()) {
			pet.giveWater(20);
		}

	}

	public void tick() {
		for (VirtualPet pet : pets.values()) {
			pet.tick();
		}

	}

	public int feed(int foodAmount) {
		for (VirtualPet pet : pets.values()) {
			pet.feed(foodAmount);
			return currentHunger;
		}
		return currentHunger;
	}

	public int giveWater(int waterAmount) {
		for (VirtualPet pet : pets.values()) {
			pet.giveWater(waterAmount);

		}
		return currentThirst;
	}

	public int takenOut(int usedPotty) {
		for (VirtualPet pet : pets.values()) {
			pet.takenOut(usedPotty);

		}
		return currentWaste;
	}

	public int playWith(int play) {
		for (VirtualPet pet : pets.values()) {
			pet.playWith(play);

		}
		return currentBoredom;
	}

	public int takeToVet(int vet) {
		for (VirtualPet pet : pets.values()) {
			pet.takeToVet(vet);

		}
		return currentSickness;

	}

	public int putToSleep(int sleep) {
		for (VirtualPet pet : pets.values()) {
			pet.putToSleep(sleep);

		}
		return currentTiredness;
	}

}