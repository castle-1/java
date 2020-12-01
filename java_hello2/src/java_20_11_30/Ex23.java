package java_20_11_30;

public class Ex23 {

	public static void main(String[] args) {

		System.out.println(getGrade(98.4));

	}

	public static char getGrade(double avg) {
		char grade;
		
		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		return grade;
	}

}
