package java_20_12_17;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	
	@Override
	public boolean equals(Object obj) {
		boolean tf = false;
		if (this.name == ((Person) obj).name) {
			tf = true;
		}

		return tf;

	}
}
