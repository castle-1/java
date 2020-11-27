package java_20_11_27;

public class Ex03 {

	public static void main(String[] args) {
		// 80 80 60
		int kor = 80;
		int eng = 80;
		int math = 60;
		int sum = kor + eng + math;
		double avg = sum / 3.0;

		if (avg >= 90) {
			System.out.println("총합 : " + sum + "점");
			System.out.printf("평균 : %.2f점%n", avg);
			System.out.println("등급 : 수");

		} else if (avg >= 80) {
			System.out.println("총합 : " + sum + "점");
			System.out.printf("평균 : %.2f점%n", avg);
			System.out.println("등급 : 우");

		} else if (avg >= 70) {
			System.out.println("총합 : " + sum + "점");
			System.out.printf("평균 : %.2f점%n", avg);
			System.out.println("등급 : 미");

		} else if (avg >= 60) {
			System.out.println("총합 : " + sum + "점");
			System.out.printf("평균 : %.2f점%n", avg);
			System.out.println("등급 : 양");

		} else {
			System.out.println("총합 : " + sum + "점");
			System.out.printf("평균 : %.2f점%n", avg);
			System.out.println("등급 : 가");
		}

	}

}
