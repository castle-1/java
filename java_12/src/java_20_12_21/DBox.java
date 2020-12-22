package java_20_12_21;

public class DBox<L, R> {

	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>(); //기본자료형이 올 수 없다. 레퍼클래스 사용
		box.set("Apple", 25);
		System.out.println(box);
	}

	private L Left;
	private R right;

	public void set(L o, R r) {
		Left = o;
		right = r;
	}

	@Override
	public String toString() {

		return Left + " & " + right;
	}

}
