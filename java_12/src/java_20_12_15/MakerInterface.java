package java_20_12_15;

public class MakerInterface {
	public static void main(String[] args) {

		Printer prn = new Printer();

		Report doc = new Report("Simple Funny news~");
		prn.printContents(doc);

	}

}

interface Upper {
}

interface Lower {
}

interface Printable2 {
	String getContents();
}

class Report implements Printable2, Upper {

	String cons;

	public Report(String cons) {
		this.cons = cons;
	}

	public String getContents() {
		return cons;

	}

}

class Printer {
	public void printContents(Printable2 doc) {
		if (doc instanceof Upper) {
			System.out.println((doc.getContents()).toUpperCase());
		} else if (doc instanceof Lower) {
			System.out.println((doc.getContents()).toLowerCase());
		} else {
			System.out.println(doc.getContents());
		}

	}
}
