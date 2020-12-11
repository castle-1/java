package java_20_12_08;

public class Box {

	private String conts;

	Box(String cont) {
		this.conts = cont;

	}

	public String toString() {
		return conts;

	}

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);

		Box box = new Box("camera");
		System.out.println(box.toString());
		System.out.println(box); // 일반적인 객체가 print에 오면 tostring이 호출된다.
	}

}
