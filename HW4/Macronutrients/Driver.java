package Macronutrients;

public class Driver {
	public static void main(String[] args) {

		String noDiet = "";
		String paleo = "Paleo";
		String vegan = "Vegan";
		String nutAllergy = "Nut Allergy";

		Meal dianMeal = MacronutrientAbstractFactory.createMeal("Dian", paleo);
		Meal tonyMeal = MacronutrientAbstractFactory.createMeal("Tony", noDiet);
		Meal gregMeal = MacronutrientAbstractFactory.createMeal("Greg", vegan);
		Meal joshMeal = MacronutrientAbstractFactory.createMeal("Josh", noDiet);
		Meal jakeMeal = MacronutrientAbstractFactory.createMeal("Jake", nutAllergy);
		Meal daleMeal = MacronutrientAbstractFactory.createMeal("Dale", noDiet);
		
		System.out.println("\n" + dianMeal.toString());
		System.out.println("\n" + tonyMeal.toString());
		System.out.println("\n" + gregMeal.toString());
		System.out.println("\n" + joshMeal.toString());
		System.out.println("\n" + jakeMeal.toString());
		System.out.println("\n" + daleMeal.toString());
	}
}
