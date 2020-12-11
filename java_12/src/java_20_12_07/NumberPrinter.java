package java_20_12_07;

public class NumberPrinter {
	
	private int myNum = 0;
	
	static void showInt(int n) {
		System.out.println(n);
	}
	static void showDouble(double n) {
		System.out.println(n);
	}
	
	void setNumber(int n) {
		myNum =n;
	}
	void showMyNmber() {
		showInt(myNum);
	}

}
