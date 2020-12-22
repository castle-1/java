package java_20_12_21;

public class BoundedWildcardUsage2 {

	public static void main(String[] args) {
		Box3<Toy> box = new Box3<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}

}

class Box3<T>{
	private T ob;
	public void set(T o) {
		ob = o; //toy
	}
	public T get() {
		return ob;
	}// toy만?
}

class Toy{
	@Override
	public String toString() {
		
		return "i am  a toy";
	}
}

class BoxHandler{
	
	public static void outBox(Box3<? extends Toy>box) {// toy 또는  toy를 상속 받은 클래스
		Toy t = box.get(); //꺼내는것 가능
		System.out.println(t);
	}
	
	public static void inBox(Box3<? super Toy>box, Toy n) {
		box.set(n); // 넣는것 에러
	}
	
	
}
