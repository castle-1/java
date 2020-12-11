package java_20_12_10;

import java.util.Scanner;

public class Subject {

	private String[] course;
	private int[] score;

	Subject() {

		this.course = new String[] { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		this.score = new int[] { 95, 88, 76, 62, 55 };
	}

	public void run() {
		inputPrint();
	}

	private void inputPrint() {
		Scanner sc = null;
		boolean tf = true;
		int count = 0;
		int index = 0;
		while (tf) {
			sc = new Scanner(System.in);
			System.out.println("과목 이름 >>");
			String sj = sc.next();

			if (sj.equals("그만")) {
				System.out.println("프로그램 종료!");
				tf = false;
				break;
			}

			if (course == null || score == null) {
				System.out.println("배열이 비어있습니다.");
				return;
			} else {
				for (int i = 0; i < course.length; i++) {
					if (sj.equals(course[i])) {
						count++;
						index = i;

					}

				}
				if (count != 0) {
					System.out.println(course[index] + "의 점수는" + score[index]);
				} else {
					System.out.println("없는 과목입니다.");
				}
			}
		}
		sc.close();

	}

}
