package java_20_12_18;


import java.util.Calendar;
import java.util.Scanner;

public class CountTen {

	public static void main(String[] args) {
		
		
		
		int startNowTime;
		int endNowTime;
		
		int i = 0;
		String[] name = { "황기태", "이재문" };
		int playTime[] = new int[name.length];

		Scanner sc = new Scanner(System.in);
		Calendar cal = null;
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

		while (true) {

			System.out.println(name[i] + "시작 키>>");
			String second = sc.nextLine();
			System.out.print("현재 초 시간 = " );
			cal = Calendar.getInstance();
			startNowTime = cal.get(Calendar.SECOND);
			System.out.println(startNowTime);
			sc.nextLine();

			System.out.print("10초 예상 후 키 >> ");
			second = sc.nextLine();
			System.out.print("현재 초 시간 = ");
			cal = Calendar.getInstance();
			endNowTime =cal.get(Calendar.SECOND);
			System.out.println(endNowTime);

			if (endNowTime < startNowTime) {
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
			System.out.print(name[0] + "의 결과 : " + playTime[0] +", "+ name[1]+ "의 결과 : "+ playTime[1]);
			System.out.println(" 무승부 입니다.");
			return;
			
		}else {
			temp = name[1];
		}

		for (int j = 0; j < name.length; j++) {
			System.out.print(name[j] + "의 결과 " + playTime[j] + ", ");
		}
		System.out.println("승자는 " + temp);

		sc.close();
	}
	
	

	

}
