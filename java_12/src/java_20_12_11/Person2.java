package java_20_12_11;

import java.util.Scanner;

public class Person2 {
	
	private int count=0; //엔터할때마다 1을 증가시켜주기위해
	private int playerMax; //플레이어 인원수를 받는 변수
	private String[] player;// 플레이어 이름을 받는 배열
	private Scanner sc = null;
	private boolean temp;
	
	
	public boolean br() {

		if (this.temp == true) {
			this.temp = true;
		} else {
			this.temp = false;
		}

		return this.temp;

	}
	

	public void iput() {

		System.out.print("갬블링 게임에 참여할 선수 숫자 >>");
		sc = new Scanner(System.in);
		this.playerMax = sc.nextInt();

		player = new String[playerMax];

		for(int i = 0;i<player.length;i++) {
			System.out.print(i+1 + "번째 선수 이름>> ");
			player[i] = sc.next();
		}

	}

	public boolean gameStart() {
		
		
		
		int[] playerScore = new int[3]; //1,2,3, 저장배열
		
		if(count>=playerMax) { 
			//playerMax=3이라면  count = 0,1,2 따라서 count가3일때 count=0
			count = 0;
		
		}
		
		System.out.println("[" + player[count] + "] : ");
		
		
			
			for (int j = 0; j < playerScore.length; j++) {
				playerScore[j] = (int) (Math.random() * 3) + 1;
			}

			temp = (playerScore[0] == playerScore[1]) ? 
					(playerScore[1] == playerScore[2] ? true : false) : false;

			if (this.temp == true) {
				for (int k = 0; k < playerScore.length; k++) {
					System.out.print(playerScore[k] + " ");

				}
				System.out.println(player[count] + " 님이 이기셨습니다.");					

			} else {
				for (int l = 0; l < playerScore.length; l++) {
					System.out.print(playerScore[l] + " ");

				}
				System.out.println(" 아쉽군요.");

			}

			count++;
		return temp;

	}

}
