package java_20_12_09;

public class Box {
	private String conts;

	Box(String conts) {
		this.conts = conts;
	}

	public String toString() {
		return conts;
	}

	public static void main(String[] args) {
		Box[] ar = new Box[3];

		ar[0] = new Box("First"); //생성자 초기화
		ar[1] = new Box("Second");
		ar[2] = new Box("Third");

		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}

}
