package java_20_12_21;

public class Poly  {

	public static void main(String[] args) {

		Box6<Integer> box1 = new Box6<>();
		box1.set(24);

		Box6<String> box2 = new Box6<>();
		box2.set("Poly");

		if (compBox(box1, 25))
			System.out.println("상자 안에 25 저장");

		if (compBox(box2, "Moly")) // 비교
			System.out.println("상자 안에 Moly 저장");

		System.out.println(box1.get());
		System.out.println(box2.get());

	}

	public static <T> boolean compBox(Box6<T> box, T t) {
		Box6<T> temp = new Box6<>();
		temp.set(t);

		if (box.get() == temp.get()) {
			return true;
		} else {
			return false;
		}

	}

}

class Box6<T> {

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}