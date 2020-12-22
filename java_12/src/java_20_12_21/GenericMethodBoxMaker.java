package java_20_12_21;

public class GenericMethodBoxMaker {

	public static void main(String[] args) {

		Box2<String> sBox = BoxFactory.makerBox("Sweet");
		System.out.println(sBox.get());

		Box2<Double> dBox = BoxFactory.makerBox(7.59);
		System.out.println(dBox.get());

	}

}

class Box2<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class BoxFactory {
	public static <T> Box2<T> makerBox(T o) {
		Box2<T> box = new Box2<T>();
		box.set(o);
		return box;
	}
}
