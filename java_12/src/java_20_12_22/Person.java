package java_20_12_22;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {//오버라이딩 하지 않는다면 object클래스에 정의된 주소값으로 집합을 만든다.
		
		return age%2; //2로 나눈 나머지로 집합을 만들겠다는 것은 0과 1의 집합을 구성
	}
	
	@Override
	public String toString() {
		
		return  name + "(" + age + "세)";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (name == ((Person) obj).name) {
			return true;
		} else {

			return false;
		}
		
		
	}

}
