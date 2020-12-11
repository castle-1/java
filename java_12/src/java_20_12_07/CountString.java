package java_20_12_07;

public class CountString {

	// 사용자로부터 받은 문자열(영문으로)에서 자음과 모음 개수를 계산하는 프로그램을 작성하라.
	// 영어 모음 a,e,i,o,u
	private String userString;
	private int countM = 0;

	public String getUserString() {
		return userString;
	}

	public void setUserString(String userString) {
		this.userString = userString;
	}

	public CountString(String userString) {
		this.userString = userString;
	}

	public void showCount() {

		for (int i = 0; i < +userString.length(); i++) {
			switch (userString.charAt(i)) {
			case 'a': {
				countM++;
				break;
			}
			case 'e': {
				countM++;
				break;
			}
			case 'i': {
				countM++;
				break;
			}
			case 'o': {
				countM++;
				break;
			}
			case 'u': {
				countM++;
				break;
			}
			}
		}
		System.out.println(userString + "에서 자음은 " + (userString.length() - countM) + "개 " + "모음은 " + countM + "개");

	}

}
