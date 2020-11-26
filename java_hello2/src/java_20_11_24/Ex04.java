package java_20_11_24;

public class Ex04 {

	public static void main(String[] args) {
		
		//아스키코드는 한개의 문자에 대하여 숫자를 1:1 매칭
		char ch1 = '헐';
		char ch2 = '확';
		
		char ch3 = 54736; //헐에 대한 문자표값을 알고있기때문에 인코딩 생략
		char ch4 = 54869;
		
		char ch5 = 0xD5D0;//16진수
		char ch6 = 0xd655;
		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);

	}

}
