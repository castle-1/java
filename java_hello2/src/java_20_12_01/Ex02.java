package java_20_12_01;

public class Ex02 {

	public static void main(String[] args) {

		int kor, eng, math, sum;
		kor = 90;
		eng = 80;
		math = 87;
		sum = kor + eng + math;
		double avg = sum / 3.0;

		char result = GetGrade(avg);
		System.out.println("등급 : " + result);

	}

	public static char GetGrade(double avg) {

		char result;
		System.out.println("평균 : " + avg);
		
		if (avg >= 90) {
			result = '수';
			//return '수'; //return을 난발하는 코드는 좋지 못하다.
		} else if (avg >= 80) {
			result = '우';
			//return '우';
		} else if (avg >= 70) {
			result = '미';
			//return '미';
		} else if (avg >= 60) {
			result = '양';
			//return '양';
		} else {
			result = '가';
			//return '가';
		}

		return result;

	}

}
