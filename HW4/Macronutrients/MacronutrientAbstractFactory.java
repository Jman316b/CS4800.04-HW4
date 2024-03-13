package Macronutrients;

class MacronutrientAbstractFactory {
	public static Meal createMeal(String name, String diet){

		Protein protein = ProteinFactory.getInstance().CreateProtein(diet);
		Carb carb = CarbFactory.getInstance().CreateCarb(diet);
		Fat fat = FatFactory.getInstance().CreateFat(diet);

		return new Meal(name, diet, protein, carb, fat);
	}
}
