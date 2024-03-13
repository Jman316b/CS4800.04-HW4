package Macronutrients;

import java.util.Random;

class FatFactory {
	private static FatFactory factory = null;

	public static FatFactory getInstance(){
		if (factory == null)
			factory = new FatFactory();
		return factory;
	}

	public Fat CreateFat(String diet) {
		String[] noDietFats = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
		String[] paleoFats = {"Avocado", "Tuna", "Peanuts"};
		String[] veganFats = {"Avocado", "Peanuts"};
		String[] nutAllergyFats = {"Avocado", "Sour cream", "Tuna"};
		
		String type = "";

		switch (diet) {
			case "Paleo":
				type = randomFatFromList(paleoFats);
				break;
			case "Vegan":
				type = randomFatFromList(veganFats);
				break;
			case "Nut Allergy":
				type = randomFatFromList(nutAllergyFats);
				break;
			default:
				type = randomFatFromList(noDietFats);
				break;
		}

		return new Fat(type);
	}

	private static String randomFatFromList(String[] fatList) {
		Random random = new Random();
		int randomIndex = random.nextInt(fatList.length);
		return fatList[randomIndex];
		 
	}
}
