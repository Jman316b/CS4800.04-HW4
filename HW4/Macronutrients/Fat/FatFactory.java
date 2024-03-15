package Macronutrients.Fat;

import java.util.Random;

public class FatFactory {
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
		
		String fat = "";

		switch (diet) {
			case "Paleo":
				fat = randomFatFromList(paleoFats);
				break;
			case "Vegan":
				fat = randomFatFromList(veganFats);
				break;
			case "Nut Allergy":
				fat = randomFatFromList(nutAllergyFats);
				break;
			default:
				fat = randomFatFromList(noDietFats);
				break;
		}

		switch (fat) {
			case "Avocado":
				return new Avocado();
			case "Sour cream":
				return new Sour_Cream();
			case "Tuna":
				return new Tuna();
			case "Peanuts":
				return new Peanuts();
			default:
				break;
		}

		return null;
	}

	private static String randomFatFromList(String[] fatList) {
		Random random = new Random();
		int randomIndex = random.nextInt(fatList.length);
		return fatList[randomIndex];
		 
	}
}
