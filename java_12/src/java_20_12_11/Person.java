package java_20_12_11;

import java.util.Scanner;

public class Person {
	
	private static  int count=0;
	private String player;
	private Scanner sc = null;
	private boolean temp;
	
	public Person() {
		this.count++;
	}

	public boolean br() {

		if (this.temp == true) {
			this.temp = true;
		} else {
			this.temp = false;
		}

		return this.temp;

	}

	public void iput() {

		System.out.print(count+"번째 선수 이름>> ");
		sc = new Scanner(System.in);
		player = sc.next();

	}

	public boolean gameStart() {

		int[] playerScore = new int[3];

		System.out.println("[" + player + "] : ");

		for (int j = 0; j < playerScore.length; j++) {
			playerScore[j] = (int) (Math.random() * 3) + 1;
		}

		this.temp = (playerScore[0] == playerScore[1]) ? 
				(playerScore[1] == playerScore[2] ? true : false) : false;

		if (this.temp == true) {
			for (int k = 0; k < playerScore.length; k++) {
				System.out.print(playerScore[k] + " ");

			}

			System.out.println(player + " 님이 이기셨습니다.");

		} else {
			for (int l = 0; l < playerScore.length; l++) {
				System.out.print(playerScore[l] + " ");

			}
			System.out.println(" 아쉽군요.");

		}

		return this.temp;

	}

}
