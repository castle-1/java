package java_20_12_14;

public interface Printable {
	
	public void print(String doc);
		
	}

class SPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}



