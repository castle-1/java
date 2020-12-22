package java_20_12_21;

public class DDBoxDemo {

	public static void main(String[] args) {
		DBox1<String, Integer> box1 = new DBox1<>(); // 기본자료형이 올 수 없다. 레퍼클래스 사용
		box1.set("Apple", 25);

		DBox1<String, Integer> box2 = new DBox1<>();
		box2.set("Orange", 33);

		DDBox<DBox1<String, Integer>, DBox1<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);

		System.out.println(ddbox);

	}

}

class DDBox<L, R> {
	private DBox1 l;
	private DBox1 r;

	public void set(DBox1 l, DBox1 r) {
		this.l = l;
		this.r = r;

	}

	@Override
	public String toString() {

		return l + "\n" + r;
	}

}

class DBox1<L, R> {
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
