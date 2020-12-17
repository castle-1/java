package java_20_12_16;

public class Cirlce implements Shape {
	
	double r;
	
	public Cirlce(double r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " +  r + "인 원니다.");
	}

	@Override
	public double getArea() {

		return r*r*PI;
	}

}
