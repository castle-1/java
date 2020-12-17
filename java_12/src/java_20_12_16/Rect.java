package java_20_12_16;

public class Rect implements Shape {
	double width, heitht;

	public Rect(double width, double heitht) {
		this.width = width;
		this.heitht = heitht;
	}

	@Override
	public void draw() {
		System.out.println("10x40크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {

		return width * heitht;
	}

}
