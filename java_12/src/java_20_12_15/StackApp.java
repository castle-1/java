package java_20_12_15;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		int size; // 배열의 크기, 스택 크기
		int count = 0; // 현재 스택의 크기
		String val;
		Scanner sc = null;

		sc = new Scanner(System.in);
		System.out.println("0보다 큰수를 입력하세요.");
		System.out.print("총 스택 저장 공간의 크기 입력>>");

		do {// 0보다 작거나 같으면 계속 입력

			size = sc.nextInt();
		} while (size <= 0);

		StringStack stack = new StringStack(size);
		count = stack.length(); //스택에 저장된 수, 
		//문자열을 입력할때마다 top은 하나씩줄음 줄기전에 초기값을 저장
		while (true) {
			
			System.out.print("문자열 입력 >>");
			val = sc.next();
			
			if(val.equals("그만")) {
				
				if(count == 0) {
					System.out.println("스택이 비어있습니다.");
				}else {
					System.out.print("현재 스택에 저장된 모든 문자열 팝 : ");
					for(int i = 0;i<count;i++) {
						System.out.print(stack.pop() + " ");
					}
					break;
				}
			}else {
				if(!stack.push(val)) {
					System.out.println("스택이 꽉 차서 푸시 불가!");
				}
			}
		}

	}// main

}// class
