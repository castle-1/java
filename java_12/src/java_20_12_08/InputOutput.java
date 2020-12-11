package java_20_12_08;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요. ex) 990925-1012999");
		System.out.print("입력 : ");
		
		String io = sc.next();
		StringBuilder sb = new StringBuilder(io);
		sb.replace(6, 7, " ");
		
		System.out.println("출력 : " + sb.toString());
		
		sc.close();

	}

}
