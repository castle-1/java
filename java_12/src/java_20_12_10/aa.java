package java_20_12_10;

import java.util.Scanner;

public class aa {

	private static int i;
	private static String name;

	public static void main(String[] args) {

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		// System.out.print("과목 이름 >> ");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("과목 이름 >> ");
			String name = sc.nextLine();
			for (int i = course.length - 5; i < course.length; i++) {
				if (course[i].equals(name)) {
					int n = score[i];
					System.out.println(n);

				} else if (name.equals("그만")) {
					return;
				}
			}
			
			if (course[i] != name) {
				System.out.println("없는 과목입니다.");

			}
		}

	}
}//오류