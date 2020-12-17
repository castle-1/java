package java_20_12_16;

public class Equals {

	public static void main(String[] args) {
		Inum num1 = new Inum(10);
		Inum num2 = new Inum(20);
		Inum num3 = new Inum(10);
		
		if(num1.equals(num2)) {
			System.out.println("num1, num2 내용이 같다.");
		}else {
			System.out.println("num1, num2 내용이 다르다.");
		}
		

		if(num1.equals(num3)) {
			System.out.println("num1, num3 내용이 같다.");
		}else {
			System.out.println("num1, num3 내용이 다르다.");
		}
		
		

	}

}

class Inum{
	private int num;
	public Inum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Inum)obj).num){
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
}