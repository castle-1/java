package java_20_12_21;

public class BoundedlinterfaceBox {

	public static void main(String[] args) {
		
		Box1<Apple> box = new Box1<>();
		box.set(new Apple());
		
		Apple ap = box.get();
		System.out.println(ap);

	}

}

interface Extable {
	public String eat();

}

class Apple implements Extable {
	
	@Override
	public String toString() {
		
		return "it's taste good";
	}

	@Override
	public String eat() {

		return "I am an apple";
	}

}

class Box1<T extends Extable> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {

		System.out.println(ob.eat());
		return ob;

	}
}