package java_20_12_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertCollection {

	public static void main(String[] args) {

		List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
		ArrayList<String> list = new ArrayList<String>(lst);

		for (String s : list) {
			System.out.print(s.toString() + "\t");
		}
		System.out.println();

		HashSet<String> set = new HashSet<>(list);
		list = new ArrayList<>(set);

		for (String s : set) {
			System.out.print(s.toString() + "\t");
		}
		System.out.println();

	}

}
