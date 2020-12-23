package java_20_12_23;

import java.util.Iterator;
import java.util.TreeSet;

public class SortTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();

		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		System.out.println("인스턴스 수 : " + tree.size());

		for (Integer r : tree) {
			System.out.print(r.toString()+ "\t");
		}
		System.out.println();

		for (Iterator<Integer> itr = tree.iterator(); itr.hasNext();) {
			System.out.print(itr.next().toString() + "\t");
		}
		System.out.println();

	}

}
