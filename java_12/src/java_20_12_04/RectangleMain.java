package java_20_12_04;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if (t.contatins(r)) { //t.contation 에 r의 주소를 전달
			System.out.println("t는 r을 포함합니다.");
		}
		if (t.contatins(s)) {
			System.out.println("t는 s를 포함합니다.");
		}

	}

}
