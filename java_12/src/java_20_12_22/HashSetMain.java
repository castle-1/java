package java_20_12_22;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) { 
		 	HashSet<Person> hSet = new HashSet<Person>();
	        hSet.add(new Person("LEE", 10));
	        hSet.add(new Person("LEE", 10));
	       	hSet.add(new Person("PARK", 35));
	        hSet.add(new Person("PARK", 35));

	        System.out.println("저장된 데이터 수: " + hSet.size()); //equals와 hashcode를 모두 만족해야 한다.
	        System.out.println(hSet);//HashSet의 디폴트 toString 는 -> [,]

	}

}
