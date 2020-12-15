package java_20_12_15;

public class PrintableMain {
	
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		prn = new LPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		prn = new Prn9090Drv();
		prn.print(myDoc);
	}
	

}
