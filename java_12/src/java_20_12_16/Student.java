package java_20_12_16;

import java.util.Scanner;

public class Student extends Person {
	private String schoolName, department, studentId;
	private double avg[] = new double[8];
	Scanner sc = null;

	public Student(String schoolName, String department, String studentId, int age, String name, String address) {
		super(age, name, address);
		this.schoolName = schoolName;
		this.department = department;
		this.studentId = studentId;
	}

	public void setAvg() {
		sc = new Scanner(System.in);
		for (int i = 0; i < avg.length; i++) {
			System.out.print((i + 1) + "학기 학점 -> ");

			avg[i] = sc.nextDouble();

		}
		sc.close();
	}

	public double Avg() {
		double temp = 0;
		for (int i = 0; i < avg.length; i++) {
			temp += avg[i];
		}

		return temp / avg.length;

	}

}
