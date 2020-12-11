package java_20_12_08;

import java.util.Scanner;

public class Split {

	private String split;
	private String temp;	
	private String[] str;

	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		split = sc.nextLine();

		str = split.split(" ");
		sc.close();

	}

	public void print() {

		for (int i = 0; i < str.length; i++) {
			temp = str[i];
			
			System.out.println(temp);
		}
		System.out.println("단어의 개수는 " + str.length + "개");

	}

}
