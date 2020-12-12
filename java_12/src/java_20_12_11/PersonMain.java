package java_20_12_11;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean enter;
		//String enter;
		Person sh = new Person();
		sh.iput();
		
		Person ys = new Person();	
		ys.iput();

		boolean tf = true;

		while (tf) {
			//enter = sc.nextLine();
			enter = sc.hasNextLine();
			
			if (enter) { //enter.trim().equals("")
				sh.gameStart();

				if (sh.br() == true) {
					System.out.println("게임이 종료되었습니다.");
					tf = false;
					break;
				}
			}
			sc.nextLine();
			 //enter = sc.nextLine();
			enter = sc.hasNextLine();

			if (enter) {//enter.trim().equals("")
				ys.gameStart();

				if (ys.br() == true) {
					System.out.println("게임이 종료되었습니다.");
					tf = false;
					break;
				}
			}
			sc.nextLine();

		}
		sc.close();
	}

}
