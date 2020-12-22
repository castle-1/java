package java_20_12_18;

import java.util.Calendar; //캘린더 사용
import java.util.Scanner;

public class CountTen2 {
	public static void main(String[] args) {
		int startNowTime;
		int endNowTime;
		int i = 0;
		String[] name = { "황기태", "이재문" };
		int playTime[] = new int[name.length];
		Scanner sc = new Scanner(System.in);
		Calendar cal = null;// 여기서 선언과 초기화를 동시에 하면 모든 초가 똑같이
				//나온다. 그래서 엔터를 입력하여 초를 받을때마다 객체 생성
			
				System.out.println("10초에가까운사람이이기는게임입니다.");
		
		while (true) {
			System.out.println(name[i] + "시작키>>");
			String second = sc.nextLine();
			System.out.print("현재초시간= " );
			cal = Calendar.getInstance(); //캘린더 객체 생성
			startNowTime = cal.get(Calendar.SECOND);//시작 초를 저장
			System.out.println(startNowTime);
			sc.nextLine();
			
			System.out.print("10초예상후키>> ");
			second = sc.nextLine();
			System.out.print("현재초시간= ");
			cal = Calendar.getInstance();//캘린더 객체 생성
			endNowTime =cal.get(Calendar.SECOND);//마지막 초를 저장
			System.out.println(endNowTime);
			if (endNowTime < startNowTime) { //캘린더는 인트타입
			playTime[i] = (60 - startNowTime) + endNowTime;
			} else {
			playTime[i] = endNowTime - startNowTime;
				}
			i++;
			if (i >= name.length) {
				break;
			}
		}
	String temp;
	if (playTime[0] > playTime[1]) {
		temp = name[0];
	}else if(playTime[0] == playTime[1]) {
		System.out.print(name[0] + "의결과: " + playTime[0] +", "+ name[1]+ "의결과:"
				+ playTime[1]);
	System.out.println(" 무승부입니다.");
		return;
	}else {
		temp = name[1];
	}
	for (int j = 0; j < name.length ;j++) {
		System.out.print(name[j] + "의결과" + playTime[j] + ", ");
	}
	System.out.println("승자는" + temp);
	sc.close();
}
}