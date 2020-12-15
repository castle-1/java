package java_20_12_15;

public interface Printable1 {

	void printLine(String str);

}

class SimplePrinter implements Printable1{
	
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter {
	public void printLine(String str) {
		super.printLine("start of multi....");
		super.printLine(str);
		super.printLine("end of multi");
	}
}
