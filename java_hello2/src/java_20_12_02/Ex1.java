package java_20_12_02;

public class Ex1 {

	public static void main(String[] args) {

		String str1 = "Happy"; //str1 에는 happy를 가리키는 주소가 들어있음
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		printString(str1);
		printString(str2);

	}

	public static void printString(String str) {
		System.out.println(str);
	}

}
