package java_20_12_23_hw;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Scholarship {

	Scanner sc = null;
	private String name;
	private double grades;
	private HashMap<String, Double> sch;

	public Scholarship() {
		sch = new HashMap<String, Double>();

	}

	@Override
	public String toString() {

		return name + " ";
	}
	
	public void run() {
		input();
		selection();
		
	}

	private void input() {
		System.out.println("미래장학금관리시스템입니다.");

		while (true) {
			sc = new Scanner(System.in);
			System.out.print("이름과 학점 >> ");
			name = sc.next();
			if (name.equals("그만")) {
				break;
			}

			grades = sc.nextDouble();

			sch.put(name, grades);

		}

	}

	private void selection() {
		double sel;
		System.out.print("장학생 선발 학점 기준 입력 >>");
		sel = sc.nextDouble(); // 기준 입력한 기준보다 높은 value의 key출력

		System.out.print("장학생명단 : ");

		for (Entry<String, Double> e : sch.entrySet()) { //키와 벨류 한쌍을 가지고있는 객체
			if (e.getValue() > sel) {
				System.out.print(e.getKey() + "\t");
			}

		}

		/*
		 * for (Double d : sch.values()) { if (d> sel) {
		 * System.out.println(sch.entrySet()); //System.out.print(d.toString() + "\t");
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
	}

}
