package Macronutrients;

import Macronutrients.Carb.*;
import Macronutrients.Protein.*;
import Macronutrients.Fat.*;

public class Meal {
	private String name;
	private String diet;
	private Protein protein;
	private Carb carb;
	private Fat fat;

	public Meal(String name, String diet, Protein protein, Carb carb, Fat fat) {
		this.name = name;
		this.diet = diet;
		this.protein = protein;
		this.carb = carb;
		this.fat = fat;
	}

	@Override
	public String toString() {
		return 	"## "+ diet +" Meal for "+ name + " ##\n" + 
			"Protein: " + protein.toString() + "\n" +
			"Carb: " + carb.toString() + "\n" +
			"Fat: " + fat.toString() + "\n";
	}
}
