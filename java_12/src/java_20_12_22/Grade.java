package java_20_12_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade {

	private ArrayList<Character> grade; //char 레퍼클래스 Character로 ArrayList '선언'

	public Grade() {
		grade = new ArrayList<Character>(); //'초기화'
	}

	public void run() {
		input();
		avg();
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		int count = 1;//while '몇번' 반복할지 카운트
		while (true) {
			
			char temp = ' ';//캐릭터형 '임시 저장소'
			
			System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
			temp = sc.next().charAt(0);
			grade.add(temp);// char ArrayList에 성적(A/B/C/D/F)을 하나씩 대입
			
			count ++;
			if (count > 6) {
				break;
			}

		}
		sc.close();

	}

	private void avg() {
		ArrayList<Double> temp = new ArrayList<Double>(); //평균을 구하기위해 double타입 ArrayList 생성
		//double 타입의 wrapper클래스는 Double
		double sum = 0; //총합을 저장할 변수
		double avg = 0; // 평균을 저장할 변수
		for (int i = 0; i < grade.size(); i++) { // char타입 ArrayList 사이즈만큼 반복 즉, 길이만큼 반복

			switch (grade.get(i)) {// 스위치의 파라미터로 char타입 ArrayList i번째 인덱스의 값(인자)을 받는다.
			case 'A': {
				temp.add(4.0); //0번째 인덱스의 값이 'A' 라면 double타입 ArrayList temp i번지에 4.0저장
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
		for (int j = 0; j < temp.size(); j++) { //double타입 ArrayList temp의 0번째 인덱스 부터 값들을 전부 더함
			sum += temp.get(j);

		}
		avg = sum / temp.size();// 총합과 temp의 사이즈로 평균을 구함
		System.out.println("평균 : "+avg);

	}
}
