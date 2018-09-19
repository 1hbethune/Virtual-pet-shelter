package VirtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Shelter pets = new Shelter(30, 40, 35, 20, 10, 20);
		Shelter pets2 = new Shelter(35, 40, 20, 50, 30, 40);
		Shelter pet = pets;

		System.out.println("Below is the current state of your pets.");

		System.out.println("Name   | Hunger  | Thirst | Waste   | Boredom | Sickness | Tiredness");
		System.out.println("joey   |  30     |   40   |  35     |   20    |   10     |   20");
		System.out.println("johnny |  20     |   50   |  25     |   20    |   15     |   25");
		System.out.println("For options please type Help");
		String response = input.nextLine();
		String option;

		while (response.toLowerCase().equals("help")) {
			System.out.println("What would you like to do with your pets?");
			System.out.println("1. Feed pets.");
			System.out.println("2. Water pets.");
			System.out.println("3. Take pets to potty.");
			System.out.println("4. Play with a pet.");
			System.out.println("5. Take a pet to the vet.");
			System.out.println("6. put a pet to bed.");
			System.out.println("7. To check status");
			System.out.println("Please enter an option.");
			response = input.nextLine();

			while (!response.equals("8")) {

				if (response.equals("1")) {
					System.out.println("Please enter food amount.");
					int foodAmount = input.nextInt();
					pets.feed(foodAmount);
					System.out.println("Pets have been fed.");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("2")) {
					System.out.println("Please enter an amount of water.");
					int waterAmount = input.nextInt();
					pets.giveWater(waterAmount);
					System.out.println("Pets have been given water.");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("3")) {
					System.out.println("How long did they potty.");
					int usedPotty = input.nextInt();
					pets.takenOut(usedPotty);
					System.out.println("Pets have been to the potty");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("4")) {
					System.out.println("How long did the pets play");
					int play = input.nextInt();
					pets.playWith(play);
					System.out.println("Pets have played.");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("5")) {
					System.out.println("How long were the pets at the vet?");
					int vet = input.nextInt();
					pets.takeToVet(vet);
					System.out.println("The vet appointments have been completed. All better now.");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("6")) {
					System.out.println("How long did the pets sleep.");
					int sleep = input.nextInt();
					pets.putToSleep(sleep);
					System.out.println("Pets have rested well.");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("7")) {
					System.out.println("The state of your pets are as follows:" + pets);
				} else {
					System.out.println("Thanks for montioring your pets today, have a good one.");
					System.exit(0);
				}
				pets2.tick();

				System.out.println("1. Feed pets.");
				System.out.println("2. Water pets.");
				System.out.println("3. Take pets to potty.");
				System.out.println("4. Play with a pet.");
				System.out.println("5. Take a pet to the vet.");
				System.out.println("6. put a pet to bed.");
				System.out.println("7. To check status");
				System.out.println("Please enter an option.");
				response = input.nextLine();
			}
		}
	}
}
