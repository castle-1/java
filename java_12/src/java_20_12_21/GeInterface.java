package java_20_12_21;

public class GeInterface {

	public static void main(String[] args) {
		Box4<Toy4> box = new Box4<>();
		box.set(new Toy4());

		Getable<Toy4> gt = box;
		System.out.println(gt.get());
	}

}

class Toy4 {
	@Override
	public String toString() {

		return "I am a Toy";
	}
}

interface Getable<T> {
	public T get();
}

class Box4<T> implements Getable<T> {

	private T ob;

	public void set(T o) {
		ob = o;
	}

	@Override
	public T get() {

		return ob;
	}

}
