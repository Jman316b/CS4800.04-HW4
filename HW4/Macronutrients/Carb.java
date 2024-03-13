package Macronutrients;

public class Carb {
	private String carb;

	public Carb(String carb){
		this.carb = carb;
	}

	public String getCarb() {
		return carb;
	}

	public void setCarb(String carb) {
		this.carb = carb;
	}

	@Override
	public String toString() {
		return carb;
	}
}
