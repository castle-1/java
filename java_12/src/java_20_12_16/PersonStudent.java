package java_20_12_16;

import java.util.Scanner;

public class PersonStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age;
		String name, address, schoolName, department, studentId;

		System.out.print("이름 : ");
		name = sc.next();

		System.out.print("나이 : ");
		age = sc.nextInt();

		System.out.print("주소 : ");
		address = sc.next();
		sc.nextLine();

		System.out.print("학교 : ");
		schoolName = sc.next();

		System.out.print("학과 : ");
		department = sc.next();

		System.out.print("학번 : ");
		studentId = sc.next();

		Person park = new Student(schoolName, department, studentId, age, schoolName, address);
		Student park1 = (Student) park;

		System.out.println("8학기 학점을 순서대로 입력하세요.");
		park1.setAvg();

		System.out.printf("8학기 총 평균 평점은 %.4f점 입니다.", park1.Avg());
		sc.close();

	}

}
