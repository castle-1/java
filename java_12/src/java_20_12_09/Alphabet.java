package java_20_12_09;

public class Alphabet {
	//char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력해보자. 알파벳은 26개.
	//대문자 A아스키 65;
	private char[] alphabet = new char[26];
	
	public void input() {
		char temp = 65;
		for(int i = 0;i<alphabet.length;i++) {
			alphabet[i] = temp;
			temp++;
		}
		
	}
	public void print() {
		for(int i = 0; i<alphabet.length;i++) {
			System.out.print(alphabet[i]+" ");
		}
		
	}
	
	public void totalRun() {
		input();
		print();
		
	}
	
	

}
