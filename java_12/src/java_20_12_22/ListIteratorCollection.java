package java_20_12_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCollection {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);

		ListIterator<String> litr = list.listIterator();

		String str;
		while (litr.hasNext()) { //추가된것은 가지고 있지 않음
			str = litr.next();
			System.out.print(str + "\t");
			if (str.equals("Toy")) {
				litr.add("Toy2"); // Toy를 만나면 Toy 바로옆에 add, 하지만 여기서 출력x
			}

		}
		System.out.println();

		while (litr.hasPrevious()) { // ?????
			str = litr.previous();
			System.out.print(str + "\t");
			if (str.equals("Robot")) {
				litr.add("Robot2");
			}
		}
		System.out.println();

		while (litr.hasNext()) {
			str = litr.next();
			System.out.print(str + "\t");

		}

	}

}
