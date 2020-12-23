package java_20_12_23;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorPerson {

	public static void main(String[] args) {

		TreeSet<Person> tree = new TreeSet<>(new PersonCompartor());
		tree.add(new Person("YOON", 37));
		tree.add(new Person("HONG", 53));
		tree.add(new Person("PARK", 22));

		for (Person p : tree)
			System.out.println(p);
	}

}

class PersonCompartor implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o2.age - o1.age;
	}

}

class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {

		return name + " : " + age;
	}

	@Override
	public int compareTo(Person p) {

		return this.age - p.age;
	}
}
