package java_20_12_10;

public class SuperCLS {
	
	public SuperCLS() {
		System.out.println("I am Super Class");
	}
}

class SubCLS extends SuperCLS{
	public SubCLS() {
		System.out.println("I'm Sub Class");
	}
}

class SuperSubCon{
	public static void main(String[] args) {
		new SubCLS(); //힙 영역에 올려두기만한다
	}
}
