package java_20_12_21;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); //배열로 관리

		list.add("Tony");
		list.add("Box");
		list.add("Robot");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}
		System.out.println();

		list.remove(0);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}
		System.out.println();

	}

}
