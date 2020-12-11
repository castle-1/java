package java_20_12_01;

public class Ex07 {

	public static void main(String[] args) {

		double area = getCircleArea(10.0);
		System.out.println("원의 넓이는 : " + area);

	}

	public static double getCircleArea(double r) {
		final double PI = Math.PI;
		return r * r * PI;
	}

}
