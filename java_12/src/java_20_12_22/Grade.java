package java_20_12_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade {

	private ArrayList<Character> grade;

	public Grade() {
		grade = new ArrayList<Character>();
	}

	public void run() {
		input();
		avg();
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (true) {
			
			char temp = ' ';
			
			System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
			temp = sc.next().charAt(0);
			grade.add(temp);
			
			count ++;
			if (count > 6) {
				break;
			}

		}
		sc.close();

	}

	private void avg() {
		ArrayList<Double> temp = new ArrayList<Double>();
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < grade.size(); i++) {

			switch (grade.get(i)) {
			case 'A': {
				temp.add(4.0);
				break;
			}
			case 'B': {
				temp.add(3.0);
				break;
			}
			case 'C': {
				temp.add(2.0);
				break;
			}
			case 'D': {
				temp.add(1.0);
				break;
			}
			case 'F': {
				temp.add(0.0);
				break;
			}

			}// sw

		} // for
		for (int j = 0; j < temp.size(); j++) {
			sum += temp.get(j);

		}
		avg = sum / temp.size();
		System.out.println("평균 : "+avg);

	}
}
