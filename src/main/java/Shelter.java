import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	Map<String, VirtualPet> pets = new HashMap<>();

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
}
