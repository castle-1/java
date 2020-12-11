package java_20_12_04;

public class ClassVarAcces {

	public static void main(String[] args) {
		
		AccessWay accessWay = new AccessWay();
		accessWay.num++;
		AccessWay.num++;
		System.out.println("num = "+AccessWay.num);

	}

}
