package java_20_12_10;

public class Man {

	public static void main(String[] args) {
		BusinessMan man = new BusinessMan();

	}

	String name;

	public void tellYourName() {
		System.out.println("My name is " + name);
	}

}

class BusinessMan extends Man {
	String company;
	String position;

	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My postion is " + position);
	}
}
