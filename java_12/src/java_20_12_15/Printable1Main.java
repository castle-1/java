package java_20_12_15;

public class Printable1Main {

	public static void main(String[] args) {
		SimplePrinter prn1 =  new SimplePrinter();
		MultiPrinter prn2 =  new MultiPrinter();

		if (prn1 instanceof Printable1) {
			((Printable1) prn1).printLine("This is a simple printer.");
		}
		System.out.println();

		if (prn2 instanceof Printable1) {
			((Printable1) prn2).printLine("This is a multiful printer.");
		}
	}
}
