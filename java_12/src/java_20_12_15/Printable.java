package java_20_12_15;

public interface Printable { // 구현 해야함
	void print(String doc);

}

interface ColorPrintable extends Printable { // 구현해야함
	void printCMYK(String doc);
}

class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

class Prn9090Drv implements ColorPrintable {
	@Override
	public void print(String doc) {
		System.out.println("black & white ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("CMYK ver");
		System.out.println(doc);
	}

}
