package java_20_12_08;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력");
		String str1 = sc.nextLine();//한줄을 읽어드림
		
		System.out.println("문자열 입력");
		String str2 = sc.nextLine();
		
		System.out.printf("입력된 문자열 1 : %s \n",str1);
		System.out.printf("입력된 문자열 2 : %s \n",str2);
		sc.close();

	}

}
