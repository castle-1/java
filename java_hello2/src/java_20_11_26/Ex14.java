package java_20_11_26;

public class Ex14 {

	public static void main(String[] args) {
		//n1이 제일큼?
		int n1 = 100;
		int n2 = 90;
		int n3 = 80;
		boolean isBing;
		
		isBing = n1>n2 && n1>n3;
		
		//isBing = (n1>n2) ? ((n1>n3) ? n1 :n3 ) : n2;
		
		System.out.println(isBing);
		

	}

}
