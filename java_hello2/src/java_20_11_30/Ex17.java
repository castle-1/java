package java_20_11_30;

public class Ex17 {

	public static void main(String[] args) {
		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byEveryone();

	}

	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

	public static void hiEveryone(int age, double heitht) {

		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + heitht + "cm 입니다. \n");
	}

}
