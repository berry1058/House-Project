package House;

import java.util.Scanner;

public class RyanHomesContractor {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String houseOrder = null;
		String houseOrderA = null;
		int numberInputs = 0;
		boolean houseInputs = false;
		boolean invalidInputs = false;

		SingleFamilyHome homeOrder = new SingleFamilyHome();

		System.out.println("Hello, you are about to begin the home order process. Please follow");
		System.out.println("all prompts to have the best home purchase experience.");
		System.out.println();

		do {
			System.out.println("How many floors would you want for your house? ");
			houseOrder = keyboard.nextLine();

			invalidInputs = numberIsValid(houseOrder);

		} while (invalidInputs);

		numberInputs = Integer.parseInt(houseOrder);
		homeOrder.setHowManyFloors(numberInputs);

		do {
			invalidInputs = false;

			System.out.println("How many bathrooms would you want for your house? ");
			houseOrder = keyboard.nextLine();

			invalidInputs = numberIsValid(houseOrder);

		} while (invalidInputs);

		numberInputs = Integer.parseInt(houseOrder);
		homeOrder.setBathrooms(numberInputs);

		do {
			invalidInputs = false;

			System.out.println("How many bedrooms would you want for your house? ");
			houseOrder = keyboard.nextLine();

			invalidInputs = numberIsValid(houseOrder);

		} while (invalidInputs);

		numberInputs = Integer.parseInt(houseOrder);
		homeOrder.setBedrooms(numberInputs);

		do {
			invalidInputs = false;

			System.out.println("What type of flooring would you want for your house? ");
			houseOrder = keyboard.nextLine();

			invalidInputs = wordIsValid(houseOrder);

		} while (invalidInputs);

		// numberInputs = Integer.parseInt(houseOrder);
		homeOrder.setFlooring(houseOrder);

		do {

			System.out.println("Would you like a fireplace in your new home? Please use Yes or No for your options. ");

			houseOrder = keyboard.nextLine();
			houseOrder = houseOrder.toLowerCase();
			if (houseOrder.equals("yes") || houseOrder.equals("no")) {
					if(houseOrder.equals("yes")){
				System.out.println("How many fireplaces would you like in your house?");
				houseOrderA = keyboard.nextLine();

				numberInputs = Integer.parseInt(houseOrderA);

				homeOrder.setNumberOfFirePlaces(numberInputs);
					}else{
						System.out.println("No Fireplaces will be added");
						homeOrder.setNumberOfFirePlaces(0);
					}
				invalidInputs = false;

			} else {
				invalidInputs = true;
			}
		} while (invalidInputs);

		
		do {
			System.out.println("Would you like a jacuzzi in your new home? Please use Yes or No for your options. ");

			houseOrder = keyboard.nextLine();
			houseOrder = houseOrder.toLowerCase();
			if (houseOrder.equals("yes") || houseOrder.equals("no")) {
				if(houseOrder.equals("yes")){
				System.out.println("How many jacuzzi's would you like in your house?");
				houseOrderA = keyboard.nextLine();

				numberInputs = Integer.parseInt(houseOrderA);

				homeOrder.setNumberOfJacuzzi(numberInputs);
				}else{
					System.out.println("No Jacuzzi will be added");
					homeOrder.setNumberOfJacuzzi(0);
				}
				invalidInputs = false;

			} else {
				invalidInputs = true;
			}
		} while (invalidInputs);

	
		
		do {
			invalidInputs = false;

			System.out.println("How would you want the walls to be colored? ");
			houseOrder = keyboard.nextLine();

			invalidInputs = wordIsValid(houseOrder);

		} while (invalidInputs);

		homeOrder.setWallColor(houseOrder);

		do {
			invalidInputs = false;

			System.out.println("How many windows would you want outside your house? ");
			houseOrder = keyboard.nextLine();

			invalidInputs = numberIsValid(houseOrder);

		} while (invalidInputs);

		numberInputs = Integer.parseInt(houseOrder);
		homeOrder.setWindows(numberInputs);

		do {
			System.out.println("Would you like to add a Deck to your new home? Please use Yes or No for your options. ");

			houseOrder = keyboard.nextLine();
			houseOrder = houseOrder.toLowerCase();
			if (houseOrder.equals("yes") || houseOrder.equals("no")) {
				if(houseOrder.equals("yes")){
				System.out.println("What type of deck would you like? ");
				houseOrder = keyboard.nextLine();

				invalidInputs = wordIsValid(houseOrder);
				}else{
					System.out.println("No Deck will be added");
					houseOrder = "No Deck";
				}

				invalidInputs = false;

			} else {
				invalidInputs = true;
			}
		} while (invalidInputs);

		homeOrder.setTypeOfDeck(houseOrder);

		System.out.println(homeOrder.toString());
		
		
		/*
		 * { invalidInputs = false;
		 * 
		 * System.out.
		 * println("How many bedrooms would you want for your house? ");
		 * houseOrder = keyboard.nextLine();
		 * 
		 * invalidInputs = numberIsValid(houseOrder);
		 * 
		 * } while (invalidInputs);
		 * 
		 * numberInputs = Integer.parseInt(houseOrder);
		 * homeOrder.setBedrooms(numberInputs);
		 */
	}

	private static boolean yesNo(String someStringForYesNo) {
		String fP = null;

		do {
			if (fP == "yes") {
				return true;

			} else if (fP == "no") {
				return false;
			}
		} while (fP == "yes" || fP == "no");
		return false;

	}

	public static boolean numberIsValid(String someStringToMakeANumber) {

		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);

			return false;

		} catch (NumberFormatException e) {
			return true;
		}

	}

	public static boolean wordIsValid(String someStringWithNoNumber) {

		if (someStringWithNoNumber.matches(".*\\d+.*")) {

			return true;

		} else {
			return false;
		}

	}
}
