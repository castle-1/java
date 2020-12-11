package java_20_12_10;

import java.util.Scanner;

public class Movie {

	private final int ROWS = 10;
	private final int COLS = 10;
	private int[] seat1;
	private int[] seat2;

	public Movie() {

		this.seat1 = new int[ROWS];
		this.seat2 = new int[COLS];
	}

	public void run() {
		input();
		seatPrint();
		Ticketing();
	}

	private void input() {

		for (int i = 0; i < seat1.length; i++) {
			seat1[i] = i;
		}
		for (int i = 0; i < seat2.length; i++) {
			seat2[i] = 0;
		}

	}

	private void seatPrint() {
		System.out.println("-------------------");
		for (int i = 0; i < seat1.length; i++) {

			System.out.print(seat1[i] + " ");
		}
		System.out.println();
		System.out.println("-------------------");
		for (int i = 0; i < seat2.length; i++) {
			System.out.print(seat2[i] + " ");
		}
		System.out.println();

	}

	private void Ticketing() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번째 좌석을 예약 하시겠습니까?");
		int select = sc.nextInt();

		System.out.println("-------------------");
		for (int i = 0; i < seat1.length; i++) {

			System.out.print(seat1[i] + " ");
		}
		System.out.println();
		System.out.println("-------------------");
		for (int i = 0; i < seat2.length; i++) {
			if (select == seat1[i]) {
				seat2[i] = 1;
			}
			System.out.print(seat2[i] + " ");
		}
		sc.close();
	}

}
