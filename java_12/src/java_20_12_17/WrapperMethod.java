package java_20_12_17;

public class WrapperMethod {

	public static void main(String[] args) {
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1234");

		// int a = n1;//오토 언박싱

		System.out.println("큰수 : " + Integer.max(n1, n2));
		System.out.println("작은수 : " + Integer.min(n1, n2));
		System.out.println("합 : " + Integer.sum(n1, n2));

		System.out.println("12의 2진표현 : " + Integer.toBinaryString(12));
		System.out.println("12의 8진표현 : " + Integer.toOctalString(12));
		System.out.println("12의 16진표현 : " + Integer.toHexString(12));

	}

}
