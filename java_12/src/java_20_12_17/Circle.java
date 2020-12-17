package java_20_12_17;

public class Circle {

	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString() {

		return "Circle(" + x + "," + y + ") 반지름" + radius;
	}

	@Override
	public boolean equals(Object obj) {
		boolean tf = false;

		if (this.x == ((Circle) obj).x && this.y == ((Circle) obj).y) {
			tf = true;
		}

		return tf;
	}

}
