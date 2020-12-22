package java_20_12_22;

import java.util.Iterator;
import java.util.LinkedList;

public class Add {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);

		int n;
		for (Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
			n = itr.next();
			System.out.print(n + "\t");
		}
		System.out.println();

	}

}
