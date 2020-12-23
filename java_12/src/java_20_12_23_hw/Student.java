package java_20_12_23_hw;

import java.util.Scanner;

public class Student {
	private String name, department, grade;
	private double avg;
	Scanner sc = null;

	public void input() {
		sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학년, 학점평균 입력하세요.");

		System.out.print(">>");
		name = sc.next();
		department = sc.next();
		grade = sc.next();
		avg = sc.nextDouble();

	}

	public void search() {
		System.out.println(name + ", " + department + ", " + grade + ", "
				+ avg);

	}

	@Override
	public String toString() {

		return "이름 : " + name + "\n학과 : " + department + 
				"\n학년 : " + grade + "\n학점평균 : " + avg+"\n";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStudentNumber() {
		return grade;
	}

	public void setStudentNumber(String grade) {
		this.grade = grade;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
