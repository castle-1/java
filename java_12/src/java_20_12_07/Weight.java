package java_20_12_07;

public class Weight {

	private double height;
	private double weight;
	private double standardWeight;

	public Weight(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public double standardWeight() {
		return (getHeight() - 100) * 0.9;
	}

	public void show() {

		if (weight > standardWeight()) {
			System.out.println("과체중입니다.");
		} else if (weight == standardWeight()) {
			System.out.println("표준체중 입니다.");
		} else {
			System.out.println("저체중 입니다.");
		}

	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getStandardWeight() {
		return standardWeight;
	}

	public void setStandardWeight(double standardWeight) {
		this.standardWeight = standardWeight;
	}

}
