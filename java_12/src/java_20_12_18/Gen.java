package java_20_12_18;

public class Gen {

	public static void main(String[] args) {

		Box<Apple> abox = new Box<Apple>();
		Box<Orange> bbox = new Box<Orange>();

		abox.set(new Apple());
		bbox.set(new Orange());

		Apple ap = abox.get();
		Orange og = bbox.get();

		System.out.println(ap);
		System.out.println(og);
	}
}

class Apple {
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	@Override
	public String toString() {
		return "I am an orange.";
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
