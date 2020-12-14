package java_20_12_14;

abstract class Shape {// 59
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해 반환

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}

}

class Circle extends Shape {
	double r;

	Circle(double r) {
		this(new Point(0, 0), r);
	}

	Circle(Point p, double r) {  //p는 상속받음
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {

		return r * r * Math.PI;
	}

}

class Rectangle extends Shape {
	double width, height;

	public Rectangle(double width, double height) {
		this(new Point(0, 0), width, height);
	}

	public Rectangle(Point p, double width, double height) {
		super(p);
		this.height = height;
		this.width = width;
	}

	@Override
	double calcArea() {

		return width * height;
	}

	public boolean isSquare() {
		return width == height;

	}
}

class Point {
	int x;
	int y;

	public Point() {
		this(0, 0); //생성자 호출, 파라미터가 int x, int y
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";

	}
}
