package java_20_12_18;

public class SimpleMath {

	public static void main(String[] args) {

		System.out.println("원주율 " + Math.PI);
		System.out.println("2의 제곱근 " + Math.sqrt(2));
		System.out.println();
		System.out.println("파이에대한 degree " + Math.toDegrees(Math.PI));
		System.out.println("2 파이에 대한 degree " + Math.toDegrees(2.0 * Math.PI));
		System.out.println();

		double radioan45 = Math.toRadians(45);
		System.out.println("싸인 45 " + Math.sin(radioan45));
		System.out.println("코싸인 45 " + Math.cos(radioan45));
		System.out.println("탄젠트 45 " + Math.tan(radioan45));
		System.out.println();
		System.out.println("로그 5 " + Math.log(25));
		System.out.println("2의 16제곱 " + Math.pow(2, 16));

	}

}
