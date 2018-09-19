package VirtualPetShelter;

public class VirtualPet {

	private int currentHunger;
	private int currentThirst;
	private int currentWaste;
	private int currentBoredom;
	private int currentSickness;
	private int currentTiredness;
	private String name;
	private String description;

	public VirtualPet(String name, String description, int currentHunger, int currentThirst, int currentWaste,
			int currentBoredom, int currentSickness, int currentTiredness) {
		this.name = name;
		this.description = description;
		this.currentHunger = currentHunger;
		this.currentThirst = currentThirst;
		this.currentWaste = currentWaste;
		this.currentBoredom = currentBoredom;
		this.currentSickness = currentSickness;
		this.currentTiredness = currentTiredness;

	}

	public int getCurrentHunger() {
		return currentHunger;
	}

	public void feed(int foodAmount) {
		currentHunger -= foodAmount;
		currentThirst += foodAmount;
		currentWaste += foodAmount;

	}

	public int getCurrentThirst() {
		return currentThirst;
	}

	public void giveWater(int waterAmount) {
		currentThirst -= waterAmount;

	}

	public int getCurrentWaste() {
		return currentWaste;
	}

	public void takenOut(int usedPotty) {
		currentWaste -= usedPotty;

	}

	public int getCurrentBoredom() {
		return currentBoredom;
	}

	public void playWith(int play) {
		currentBoredom -= play;
		currentTiredness += play;

	}

	public int getCurrentSickness() {
		return currentSickness;
	}

	public void takeToVet(int vet) {
		currentSickness -= vet;

	}

	public int getCurrentTiredness() {
		return currentTiredness;
	}

	public void putToSleep(int sleep) {
		currentTiredness -= sleep;

	}

	public void tick() {
		currentBoredom += 10;
		currentHunger += 10;
		currentTiredness += 10;

	}

	@Override
	public String toString() {
		return "VirtualPet [currentHunger=" + currentHunger + ", currentThirst=" + currentThirst + ", currentWaste="
				+ currentWaste + ", currentBoredom=" + currentBoredom + ", currentSickness=" + currentSickness
				+ ", currentTiredness=" + currentTiredness + "]";
	}

	public String getName() {
		return name;
	}

}
