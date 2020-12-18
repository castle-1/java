package java_20_12_18;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CountTen {

	public static void main(String[] args) {

		int i = 0;
		String[] name = { "황기태", "이재문" };
		int playTime[] = new int[name.length];

		Scanner sc = new Scanner(System.in);
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

		while (true) {

			System.out.println(name[i] + "시작 키>>");
			String second = sc.nextLine();
			System.out.printf("현재 초 시간 = ", "%5s");
			String startNowTime = getCurrentTime("ss");
			System.out.println(startNowTime);
			sc.nextLine();

			System.out.print("10초 예상 후 키 = ");
			second = sc.nextLine();
			System.out.print("현재 초 시간 = ");
			String endNowTime = getCurrentTime("ss");
			System.out.println(endNowTime);

			if (Integer.parseInt(endNowTime) < Integer.parseInt(startNowTime)) {
				playTime[i] = (60 - Integer.parseInt(startNowTime)) + Integer.parseInt(endNowTime);

			} else {
				playTime[i] = Integer.parseInt(endNowTime) - Integer.parseInt(startNowTime);
			}
			i++;

			if (i >= name.length) {

				break;
			}

		}

		String temp;
		if (playTime[0] < playTime[1]) {
			temp = name[0];
		} else {
			temp = name[1];
		}

		for (int j = 0; j < name.length; j++) {
			System.out.print(name[j] + "의 결과 " + playTime[j] + ", ");
		}
		System.out.println("승자는 " + temp);

		sc.close();
	}

	public static String getCurrentTime(String timeFormat) {
		return new SimpleDateFormat(timeFormat).format(System.currentTimeMillis());
	}

}
