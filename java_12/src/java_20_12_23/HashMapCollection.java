package java_20_12_23;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(45, "Brown");
		map.put(37, "Jamse");
		map.put(23, "Martin");
		map.put(23, "LEE");

		System.out.println("23번 :" + map.get(23));
		System.out.println("37번 :" + map.get(37));
		System.out.println("45번 :" + map.get(45));
		System.out.println("23번 :" + map.get(23));
		
		map.remove(23);
		System.out.println("23번 :" + map.get(23));

	}

}
