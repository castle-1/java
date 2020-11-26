package java_20_11_26;

public class Ex11 {

	public static void main(String[] args) {

		byte n1 = 5;  //00000101
		byte n2 = 3;  //00000011
		byte n3 = -1; //11111111

		byte r1 = (byte) (n1 & n2); //and
		byte r2 = (byte) (n1 | n2); //or
		byte r3 = (byte) (n1 ^ n2); //xor
		byte r4 = (byte) (~n3);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

}
