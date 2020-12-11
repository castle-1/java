package java_20_12_11;

public class Shape {

	public static void main(String[] args) {
		Shape circle = new Circle(3);
		System.out.println(circle.getArea());

		Shape rectangle = new Rectangle(13, 3);
		System.out.println((int)rectangle.getArea());

	}

	private int height;
	private int width;

	public Shape() {
	}

	public Shape(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	protected double getArea() {
		return 0.0;
	}

}

class Circle extends Shape {

	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * Math.PI;
	}

}

class Rectangle extends Shape {

	public Rectangle(int height, int width) {
		super(height, width);
	}

	@Override
	public double getArea() {
		return getHeight()*getWidth();
	}
}
