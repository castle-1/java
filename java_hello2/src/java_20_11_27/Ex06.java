package java_20_11_27;

public class Ex06 {

	public static void main(String[] args) {
		int num1 = 95;
		int num2 = 99;
		int num3 = 93;
		int max = 0;

		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num1 && num2 > num3) {
			max = num2;

		} else {
			max = num3;
		}

		System.out.println(max);
		// max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 :
		// num3);

	}

}
