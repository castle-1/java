package java_20_11_30;

public class Ex24 {// pi*r*r

	public static void main(String[] args) {

		System.out.println(CircleArea(9));

	}

	public static double CircleArea(int num) {

		final double pi = Math.PI;
		return (pi * num * num);
	}

}
