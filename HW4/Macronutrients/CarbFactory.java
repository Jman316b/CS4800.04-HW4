package Macronutrients;

import java.util.Random;

class CarbFactory {
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

		String type = "";

		switch (diet) {
			case "Paleo":
				type = randomCarbFromList(paleoCarbs);
				break;
			case "Vegan":
				type = randomCarbFromList(veganCarbs);
				break;
			case "Nut Allergy":
				type = randomCarbFromList(nutAllergyCarbs);
				break;
			default:
				type = randomCarbFromList(noDietCarbs);
				break;
		}

		return new Carb(type);
	}

	private static String randomCarbFromList(String[] carbList) {
		Random random = new Random();
		int randomIndex = random.nextInt(carbList.length);
		return carbList[randomIndex];
		 
	}
}
