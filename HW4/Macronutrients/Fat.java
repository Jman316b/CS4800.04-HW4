package Macronutrients;

public class Fat {
	private String fat;

	public Fat(String fat){
		this.fat = fat;
	}

	public String getFat() {
		return fat;
	}

	public void setFat(String fat) {
		this.fat = fat;
	}

	@Override
	public String toString() {
		return fat;
	}
}
