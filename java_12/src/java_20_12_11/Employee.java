package java_20_12_11;

public class Employee { //상위클래스
	
	public static void main(String[] args) {
		Regular regular = new Regular("kim", 35, "종로구", "영업");
		
		regular.setsetter(500);
		regular.printInfo();
		
		
	}
	
	private String name, address, department;
	private int age, setter;


	public Employee(String name, int age, String address, String  department) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
	}
	
	
	public void printInfo() {
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("부서 : " + department);
		
	}
	

}

class Regular extends Employee{
	private int setter;
	
	public int getsetter() {
		return setter;
	}


	public void setsetter(int setter) {
		this.setter = setter;
	}
	
	public Regular(String name, int age, String address, String  department) {
		super(name, age, address, department);
	}
	
	public void printInfo() {
		System.out.println("월급 : "+setter);
		System.out.println("정규직" );
		
		
	}
	
}

class Temporary extends Employee{
	public Temporary(String name, int age, String address, String  department) {
		super(name, age, address, department);
	}
	
}
