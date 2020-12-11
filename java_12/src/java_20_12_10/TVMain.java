package java_20_12_10;

public class TVMain {
	
	public static void main(String[] args) {
		ColorTV colorTV = new ColorTV(32,1024);
		colorTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2",32, 2048);
		iptv.printProperty();
	}

}
