package java_20_12_11;

import java.util.Scanner;

public class Person {
	
	//private int playerMax;
	//private String[] player;
	private String player;
	private Scanner sc = null;

	public void iput() {
		
		System.out.print("번째 선수 이름>> ");
		sc = new Scanner(System.in);
		player = sc.next();
		
		/*System.out.print("player가 몇명입니까? >>");
		sc = new Scanner(System.in);
		playerMax = sc.nextInt();

		player = new String[playerMax];

		for (int i = 0; i < player.length; i++) {
			System.out.print(i + 1 + "번째 선수 이름>> ");
			player[i] = sc.next();

		}*/

	}

	public void gameStart() {
		//boolean tf = false;
		int[] playerScore = new int[3];

		boolean temp;

		// char enter = sc.next().charAt(0);

		//System.out.println("[" + player[0] + "] : ");
		System.out.println("[" + player + "] : ");

		if (true) {
			for (int j = 0; j < playerScore.length; j++) {
				playerScore[j] = (int) (Math.random() * 3) + 1;
			}

			temp = (playerScore[0] == playerScore[1]) ? (playerScore[1] == playerScore[2] ? true : false) : false;

			if (temp == true) {
				for (int k = 0; k < playerScore.length; k++) {
					System.out.print(playerScore[k] + " ");

				}
				//System.out.println(player[0] + " 님이 이기셨습니다.");
				System.out.println(player + " 님이 이기셨습니다.");
				//tf = true;

			} else {
				for (int l = 0; l < playerScore.length; l++) {
					System.out.print(playerScore[l] + " ");

				}
				System.out.println(" 아쉽군요.");

			}

		}

	}

}
