package java_20_12_08;

import java.util.Scanner;

public class Hong {
	
	private String firstName;
	private String secondName;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("성을 입력하세요.");
		firstName = sc.next();
		System.out.println("이름을 입력하세요.");
		secondName = sc.next();
		sc.close();
	}
	public void print() {
		if(secondName == null) {
			System.out.println("공백이 없군요. 다시 입력해주세요.");
			input();
		}else {
			System.out.println("성 = " + firstName);
			System.out.println("이름 = " + secondName);
		}
	}

}
