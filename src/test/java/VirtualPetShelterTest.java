import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	Shelter underTest;
	VirtualPet joey;
	VirtualPet johnny;

	@Before
	public void setUp() {
		underTest = new Shelter();
		joey = new VirtualPet("Joey", "Lazy Limabean", 50, 50, 50, 50, 50, 50);
		johnny = new VirtualPet("johnny", "Protective, but can be mean", 50, 50, 50, 50, 50, 50);
	}

	@Test
	public void shouldBeAbleToAddPetToShelter() {
		underTest.add(joey);
		VirtualPet foundPet = underTest.retrievePet("Joey");
		assertThat(foundPet, is(joey));
	}

	@Test
	public void shouldBeAbleToAddTwoPets() {
		underTest.add(joey);
		underTest.add(johnny);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		assertThat(allPets, containsInAnyOrder(joey, johnny));
	}

	@Test
	public void shouldBeAbleToAdoptAPet() {
		Shelter underTest = new Shelter();
		VirtualPet joey = new VirtualPet("Joey", "Cute kangaroo", 50, 50, 50, 50, 50, 50);
		underTest.add(joey);
		underTest.close(joey);
		VirtualPet foundPet = underTest.retrievePet("Joey");
		assertThat(foundPet, is(nullValue()));
	}

	@Test
	public void shouldBeAbleToFeedAllPets() {
		underTest.add(joey);
		underTest.add(johnny);
		underTest.feedAll();
		assertThat(joey.getCurrentHunger(), is(30));
		assertThat(johnny.getCurrentHunger(), is(30));
	}

	@Test
	public void shouldBeAbleToWaterPet() {
		underTest.add(joey);
		underTest.add(johnny);
		underTest.waterAll();
		assertThat(joey.getCurrentThirst(), is(30));
		assertThat(johnny.getCurrentThirst(), is(30));
	}

	@Test
	public void shouldBeAbleToPlayWithPet() {
		underTest.add(johnny);
		underTest.play(johnny.getCurrentThirst(), 20);
		assertThat(johnny.getCurrentTiredness(), is(70));
		assertThat(johnny.getCurrentBoredom(), is(30));
	}

	@Test
	public void shouldIncreaseBoredomBy10WhenTick() {
		underTest.add(joey);
		underTest.add(johnny);
		underTest.tick();
		int check = joey.getCurrentBoredom();
		int check2 = johnny.getCurrentBoredom();
		assertThat(check, is(60));
		assertThat(check2, is(60));
	}

	@Test
	public void shouldIncreaseHungerBy10WhenTick() {
		underTest.add(joey);
		underTest.add(johnny);
		underTest.tick();
		int check = joey.getCurrentHunger();
		int check2 = johnny.getCurrentHunger();
		assertThat(check, is(60));
		assertThat(check2, is(60));

	}

	@Test
	public void shouldIncreaseTirednessBy10WhenTick() {
		underTest.add(joey);
		underTest.add(johnny);
		underTest.tick();
		int check = joey.getCurrentTiredness();
		int check2 = johnny.getCurrentTiredness();
		assertThat(check, is(60));
		assertThat(check2, is(60));
	}

}
