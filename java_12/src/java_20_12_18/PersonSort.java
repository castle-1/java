package java_20_12_18;

import java.util.Arrays;

public class PersonSort {

	public static void main(String[] args) {
		Person4[] ar = new Person4[3];

        ar[0] = new Person4("Lee1", 29); //2
        ar[1] = new Person4("Goo12", 15); //1
        ar[2] = new Person4("Soo123", 37); //3

        Arrays.sort(ar);
        
        for(Person4 p: ar) {
        	System.out.println(p);
        }

	}

}

class Person4 implements Comparable{
	private String name;
	private int age;
	
	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return name + " : " + age;
	}

	@Override
	public int compareTo(Object o) {
		Person4 p = (Person4) o;
		
		return this.name.length() - ((Person4)o).name.length();
	}
	
}

class Person3 implements Comparable{
	private String name;
	private int age;
	
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return name + " : " + age;
	}

	@Override
	public int compareTo(Object o) {
		Person3 p = (Person3) o;
		
		return this.name.charAt(0) - ((Person3)o).name.charAt(0);
	}
	
}
