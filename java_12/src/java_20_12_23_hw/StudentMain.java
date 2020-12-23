package java_20_12_23_hw;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = null;

		Student hwang = new Student();
		hwang.input();
		Student lee = new Student();
		lee.input();
		Student kim = new Student();
		kim.input();
		Student choe = new Student();
		choe.input();

		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(hwang);
		stu.add(lee);
		stu.add(kim);
		stu.add(choe);

		for (Student s : stu) {
			System.out.println(s);
		}

		while (true) {
			sc = new Scanner(System.in);
			boolean count = false;
			String student;

			System.out.print("학생 이름 >>");
			student = sc.next();

			if (student.equals("그만")) {
				sc.close();
				return;
			}
			for (int i = 0; i < stu.size(); i++) {

				if (stu.get(i).getName().equals(student)) {
					count = true;

				}
				if (count) {
					stu.get(i).search();
					break;
				}

			} //
			if (count == false) {
				System.out.println("학생을 찾을 수 없습니다.");
			}

		}

	}

}
