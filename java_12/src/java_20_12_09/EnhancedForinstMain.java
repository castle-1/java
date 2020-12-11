package java_20_12_09;

public class EnhancedForinstMain {

	public static void main(String[] args) {
		
		Box1[] ar = new Box1[5];
		ar[0] = new Box1(101, "Coffe");
		ar[1] = new Box1(102, "Bread");
		ar[2] = new Box1(103, "Computer");
		ar[3] = new Box1(104, "Glass");
		ar[4] = new Box1(105, "Apple");
		
		
		for(Box1 e: ar) {
			if(e.getBoxnum() == 101)
			System.out.println(e.toString());
		}

	}

}
