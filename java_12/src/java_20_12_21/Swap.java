package java_20_12_21;

public class Swap {

	public static void main(String[] args) {

		Box5<Integer> box1 = new Box5<>();
		box1.set(99);

		Box5<Integer> box2 = new Box5<>();
		box2.set(55);

		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());

	}

	public static <T extends Number> void swapBox(Box5<T> box1, Box5<T> box2) {
		T temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);

	}

}

class Box5<T> {
	private T num;

	public void set(T t) {
		this.num = t;
	}

	public T get() {
		return num;

	}

}
