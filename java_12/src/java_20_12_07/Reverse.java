package java_20_12_07;

public class Reverse {

	private String reverse;

	public void show() {
		System.out.println("입력한 문자열을 거꾸로 출력합니다.");

		for (int i = reverse.length()-1 ; i >= 0; i--) { // 인덱스가 0번지부터 시작
			System.out.print(reverse.charAt(i));

		}

		System.out.println();

	}

	Reverse(String reverse) {
		this.reverse = reverse;
	}

	public String getReverse() {
		return reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

}
