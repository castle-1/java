package java_20_12_21;

public class BoxInBox {
	public static void main(String[] args) {

		Box<String> sBox = new Box<>();
		sBox.set("I am happy");

		Box<Box<String>> wBox = new Box(); //타입이 Box<String> 즉, T에 Box<String>
		wBox.set(sBox);

		Box<Box<Box<String>>> zBox = new Box();
		zBox.set(wBox);

		System.out.println(zBox.get().get().get());

	}

}

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}
