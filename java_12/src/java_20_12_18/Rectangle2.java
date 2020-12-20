package java_20_12_18;

import java.util.Arrays;

public class Rectangle2 implements Comparable {
	private int width, height;

	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;

	}

	public static Rectangle2[] getSortingRec(Rectangle2[] temp) { // 내림차순
		Arrays.sort(temp);

		return temp;

	}

	@Override
	public String toString() {

		return "내림차순 정렬 " + getArea();
	}

	@Override
	public int compareTo(Object o) {

		if (this.getArea() > ((Rectangle2) o).getArea()) {
			return -1;
		} else if (this.getArea() < ((Rectangle2) o).getArea()) {
			return 1;
		} else {

			return 0;
		}
	}

}
