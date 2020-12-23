package java_20_12_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CarSortCollection {

	public static void main(String[] args) {
		List<Car1> list = new ArrayList<Car1>();
		list.add(new Car1(1200));
		list.add(new Car1(3000));
		list.add(new Car1(1800));

		Collections.sort(list);
		for (Iterator<Car1> itr = list.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}

	}

}

class Car1 implements Comparable<Car1> {

	private int disp;

	Car1(int d) {
		disp = d;
	}

	@Override
	public String toString() {

		return "cc : " + disp;
	}

	@Override
	public int compareTo(Car1 o) {

		return disp - o.disp;
	}

}
