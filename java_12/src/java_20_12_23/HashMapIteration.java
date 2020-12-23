package java_20_12_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(45, "Brown");
		map.put(37, "Jamse");
		map.put(23, "Martin");
		
		Set<Integer> ks = map.keySet();
		for(Integer n : ks) {
			System.out.print(n.toString() + "\t");
		}
		System.out.println();
		
		for(Integer n : ks) {
			System.out.print(map.get(n).toString() + "\t");
		}
		System.out.println();
		
		for(Iterator<Integer> itr = ks.iterator();itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
	}

}
