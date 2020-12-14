package java_20_12_11;

import java.util.Scanner;

public class PersonMain2 {

	public static void main(String[] args) {

		Scanner sc = null;
		String enter;
		Person2 sh = new Person2();

		sh.iput();

		boolean tf = true;

		while (tf) {
			sc = new Scanner(System.in);
			enter = sc.nextLine(); //키보드상 enter = \r\n
			//\n을 포함하는 한 라인을 읽고 \n 을 버린 나머지만 리턴

			if (enter.trim().equals("")) {
				//\n을 버린 나머지를 리턴받아 가장 앞과 가장 뒤 공백을 제거한 enter가
				//"" 과 같냐?
				sh.gameStart();

				if (sh.br() == true) {
					System.out.println("게임이 종료되었습니다.");
					tf = false;
					break;
				}
			}

		}
		sc.close();
	}

}
