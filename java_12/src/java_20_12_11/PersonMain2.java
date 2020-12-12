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
			enter = sc.nextLine();

			if (enter.trim().equals("")) {
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
