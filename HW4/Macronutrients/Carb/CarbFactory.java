package Macronutrients.Carb;

import java.util.Random;

public class CarbFactory {
	private static CarbFactory factory = null;

	public static CarbFactory getInstance(){
		if (factory == null)
			factory = new CarbFactory();
		return factory;
	}

	public Carb CreateCarb(String diet) {
		String[] noDietCarbs = {"Cheese", "Bread", "Lentils", "Pistachio"};
		String[] paleoCarbs = {"Pistachio"};
		String[] veganCarbs = {"Bread", "Lentils", "Pistachio"};
		String[] nutAllergyCarbs = {"Cheese", "Bread", "Lentils"};

		String carb = "";

		switch (diet) {
			case "Paleo":
				carb = randomCarbFromList(paleoCarbs);
				break;
			case "Vegan":
				carb = randomCarbFromList(veganCarbs);
				break;
			case "Nut Allergy":
				carb = randomCarbFromList(nutAllergyCarbs);
				break;
			default:
				carb = randomCarbFromList(noDietCarbs);
				break;
		}

		switch (carb) {
			case "Cheese":
				return new Cheese();
			case "Bread":
				return new Bread();
			case "Lentils":
				return new Lentils();
			case "Pistachio":
				return new Pistachio();
			default:
				break;
		}

		return null;
	}

	private static String randomCarbFromList(String[] carbList) {
		Random random = new Random();
		int randomIndex = random.nextInt(carbList.length);
		return carbList[randomIndex];
		 
	}
}
