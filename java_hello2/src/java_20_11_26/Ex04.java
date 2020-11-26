package java_20_11_26;

public class Ex04 {

	public static void main(String[] args) {
		short num = 10;
		num = (short) (num + 77l); //short 형변환 
		int rate = 3;
		rate = (int)(rate * 3.5); //정수로 연산 소수점 손실
		System.out.println(num);
		System.out.println(rate);

		num = 10;
		num += 77l; //복합연산자는 형변환x
		rate = 3;
		rate *= 3.5; 
		System.out.println(num);
		System.out.println(rate);

	}

}
