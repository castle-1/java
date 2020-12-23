package java_20_12_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CarComparator {

	public static void main(String[] args) {
		
		List<Car2> clist = new ArrayList<Car2>();
		clist.add(new Car2(1800));
		clist.add(new Car2(1200));
		clist.add(new Car2(3000));
		
		List<ECar> elist = new ArrayList<ECar>();
		elist.add(new ECar(3000, 55));
		elist.add(new ECar(1800, 87));
		elist.add(new ECar(1200, 99));
		
		CarComp comp = new CarComp();
		Collections.sort(clist,comp);
		Collections.sort(elist,comp);
		
		for(Iterator<Car2> itr = clist.iterator();itr.hasNext();) {
			System.out.print(itr.next().toString() + "\t");
		}
		System.out.println();
		

		for(Iterator<ECar> itr = elist.iterator();itr.hasNext();) {
			System.out.print(itr.next().toString() + "\t");
		}
		System.out.println();

	}

}

class Car2{
	protected int disp;
	
	public Car2(int d) {
		disp = d;
	}
	@Override
	public String toString() {
		
		return "CC" + disp;
	}
}

class CarComp implements Comparator<Car2>{
	
	
	@Override
	public int compare(Car2 o1, Car2 o2) {
		
		return o1.disp - o2.disp;
	}
	
}

class ECar extends Car2{
	private int battery;
	
	public ECar(int d, int b) {
		super(d);
		battery = b;
	}
	@Override
	public String toString() {
		
		return "CC" + disp + ", ba : " + battery;
	}
}