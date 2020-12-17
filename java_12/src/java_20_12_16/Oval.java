package java_20_12_16;

public class Oval implements Shape {

	double x, y;

	public Oval(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("20x30에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {

		return x * y * Math.PI;
	}

}
