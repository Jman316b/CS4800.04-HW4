package Macronutrients;

import java.util.Random;

class ProteinFactory {
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
		
		String type = "";

		switch (diet) {
			case "Paleo":
				type = randomProteinFromList(paleoProteins);
				break;
			case "Vegan":
				type = randomProteinFromList(veganProteins);
				break;
			default:
				type = randomProteinFromList(noDietProteins);
				break;
		}

		return new Protein(type);
	}

	private static String randomProteinFromList(String[] proteinList) {
		Random random = new Random();
		int randomIndex = random.nextInt(proteinList.length);
		return proteinList[randomIndex];
		 
	}
}
