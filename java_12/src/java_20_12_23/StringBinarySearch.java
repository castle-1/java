package java_20_12_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringBinarySearch {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		Collections.sort(list);
		int index = Collections.binarySearch(list, "Robot");
		System.out.println(list.get(index));

	}

}
