package java_29_11_30;

public class Ex03 {

	public static void main(String[] args) {

		int kor = 80;
		int math = 80;
		int eng = 60;
		int total = kor + math + eng;

		double avg = total / 3.0;

		if (avg > 90) {
			System.out.println("평균 : " + avg);
			System.out.println("등급 : 수");
		} else if (avg >= 80) {
			System.out.println("평균 : " + avg);
			System.out.println("등급 : 우");
		} else if (avg >= 70) {
			System.out.println("평균 : " + avg);
			System.out.println("등급 : 미");
		} else if (avg >= 60) {
			System.out.println("평균 : " + avg);
			System.out.println("등급 : 양");
		} else {
			System.out.println("평균 : " + avg);
			System.out.println("등급 : 가");
		}

	}

}
