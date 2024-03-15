package Macronutrients.Protein;

import java.util.Random;

public class ProteinFactory {
	private static ProteinFactory factory = null;

	public static ProteinFactory getInstance(){
		if (factory == null)
			factory = new ProteinFactory();
		return factory;
	}

	public Protein CreateProtein(String diet) {
		
		String[] noDietProteins = {"Fish", "Chicken", "Beef", "Tofu"};
		String[] paleoProteins = {"Fish", "Chicken", "Beef"};
		String[] veganProteins = {"Tofu"};
		
		String protein = "";

		switch (diet) {
			case "Paleo":
				protein = randomProteinFromList(paleoProteins);
				break;
			case "Vegan":
				protein = randomProteinFromList(veganProteins);
				break;
			default:
				protein = randomProteinFromList(noDietProteins);
				break;
		}

		switch (protein) {
			case "Fish":
				return new Fish();
			case "Chicken":
				return new Chicken();
			case "Beef":
				return new Beef();
			case "Tofu":
				return new Tofu();
			default:
				break;
		}

		return null;
	}

	private static String randomProteinFromList(String[] proteinList) {
		Random random = new Random();
		int randomIndex = random.nextInt(proteinList.length);
		return proteinList[randomIndex];
		 
	}
}
