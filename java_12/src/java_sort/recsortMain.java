package java_sort;

import java.util.Arrays;

public class recsortMain {

	public static void main(String[] args) {

		Rectangle[] recArr = { new Rectangle(6, 6), new Rectangle(5, 5), new Rectangle(10, 10), new Rectangle(12, 12),
				new Rectangle(11, 11) };

		RecArrays.sort(recArr);
		

		//Arrays.sort(recArr);

		for (Rectangle rec : recArr) {
			System.out.println(rec.getArea());
		}

	}

}
