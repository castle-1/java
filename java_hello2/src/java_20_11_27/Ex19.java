package java_20_11_27;

public class Ex19 {

	public static void main(String[] args) {

		int price = 126500;
		int fiveman = price / 50000; // 오만
		int oneman = (price % 50000) / 10000; // 일만
		int fivecheon = ((price % 50000) % 10000) / 5000; // 오천
		int onecheon = (((price % 50000) % 10000) % 5000) / 1000; // 일천
		int fivebaeg = ((((price % 50000) % 10000) % 5000) % 1000) / 500; // 오백
		int onebaeg = (((((price % 50000) % 10000) % 5000) % 1000) % 500) / 100; // 일백

		System.out.println(price+"원");
		System.out.println("5만원권 : " + fiveman + "장");
		System.out.println("1만원권 : " + oneman + "장");
		System.out.println("5천원권 : " + fivecheon + "장");
		System.out.println("1천원권 : " + onecheon + "장");
		System.out.println("500원 동전 : " + fivebaeg + "개");
		System.out.println("100원 동전 : " + onebaeg + "개");

	}

}
