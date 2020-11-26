package java_20_11_26;

public class Ex10 {

	public static void main(String[] args) {
		
		byte n1 = 13;
		byte n2 = 7;
		
		byte n3 = (byte)(n1 & n2); //13과 7을 2진수로 변환후 각 자리수마다 비교하여 둘다 1인경우 에만 1
		System.out.println(n3);

	}

}
