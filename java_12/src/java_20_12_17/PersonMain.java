package java_20_12_17;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최명태")));

	}

}
