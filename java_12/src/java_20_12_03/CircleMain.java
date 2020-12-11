package java_20_12_03;

public class CircleMain {

	public static void main(String[] args) {
		Circle circle = new Circle(1.5);
		System.out.println(circle.getArea());

		circle.setRad(2.5);
		System.out.println(circle.getArea());
		circle.setRad(-3.3);
		System.out.println(circle.getArea());
		circle.setRad(-4.5);
		System.out.println(circle.getArea());

	}

}
