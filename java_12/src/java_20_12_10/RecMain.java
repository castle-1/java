package java_20_12_10;

class SuperCLS2 {
	static int count = 0;

	public SuperCLS2() {
		count++;
	}

}

class SubCLS2 extends SuperCLS2 {
	public void showCount() {
		System.out.println(count);
	}
}

public class RecMain {
	public static void main(String[] args) {

		SuperCLS2 cls2 = new SuperCLS2();
		SuperCLS2 cls22 = new SuperCLS2();

		SubCLS2 cls23 = new SubCLS2();
		cls23.showCount();
	}
}
