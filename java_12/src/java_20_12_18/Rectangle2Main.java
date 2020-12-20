package java_20_12_18;

import java.util.Scanner;

public class Rectangle2Main {

	public static void main(String[] args) {

		int width;
		int height;
		Scanner sc = new Scanner(System.in);
		Rectangle2[] rectangle = new Rectangle2[4];

		
		for(int i = 0; i<rectangle.length;i++) {
		
		System.out.println(i+1 +"번 객체 가로를 입력하세요.");
		width = sc.nextInt();
		System.out.println(i+1+"번 객체 세로를 입력하세요.");
		height = sc.nextInt();
		
		rectangle[i] = new Rectangle2(width, height);
		
		}
		Rectangle2[] recSorting = Rectangle2.getSortingRec(rectangle);
		
		for(Rectangle2 r : recSorting) {
			System.out.println(r);
		}
		
		sc.close();

	}

}
