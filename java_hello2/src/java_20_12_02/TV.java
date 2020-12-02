package java_20_12_02;

public class TV {

	String brand;
	int year, inch;

	public TV(String brand, int year, int inch) {

		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public void show() {
		System.out.println(brand + "에서 민든 " + year + "년형 " + inch + "인치 TV");
	}

}
