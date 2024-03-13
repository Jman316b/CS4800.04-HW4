package Macronutrients;

public class Protein {
	private String protein;

	public Protein(String protein){
		this.protein = protein;
	}

	public String getProtein() {
		return protein;
	}

	public void setProtein(String protein) {
		this.protein = protein;
	}

	@Override
	public String toString() {
		return protein;
	}
}
