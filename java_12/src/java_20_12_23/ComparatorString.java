package java_20_12_23;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorString {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>(new StringComparator());
		tree.add("Box");
		tree.add("Rabbit");
		tree.add("Robot");

		for (String s : tree) {
			System.out.print(s.toString() + "\t");

		}
		System.out.println();
	}

}

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o1.length() - o2.length();
	}

}