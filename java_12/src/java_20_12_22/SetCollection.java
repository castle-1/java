package java_20_12_22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box"); //중복
		System.out.println("인스턴스 수 : " + set.size());
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		for(String s : set) {
			System.out.print(s + "\t");
		}
		System.out.println();

	}

}
