package java_20_12_15;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("a/b..........a? :");
			int n1 = sc.nextInt();
			System.out.print("a/b..........b? :");
			int n2 = sc.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Good bye~~~!");
		sc.close();
	}

}
