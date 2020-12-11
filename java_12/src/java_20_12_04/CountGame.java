package java_20_12_04;

import java.util.Scanner;

public class CountGame {

	private int com = (int) (Math.random() * 10+1);
	private int player;
	private int count = 0;
	
	private Scanner sc = null;

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void run() {
		boolean tf = true;
		
		while (tf) {
			sc = new Scanner(System.in);
			count++;
			if (getCom() == getPlayer()) {
				System.out.println("정답입니다.\n" + getCount() + "번만에 정답.");
				tf = false;
				break;
			} else if (getCom() > getPlayer()) {
				System.out.println("up!");
				setPlayer(player= sc.nextInt());
				continue;
			} else if (getCom() < getPlayer()) {
				System.out.println("down!");
				setPlayer(player = sc.nextInt());
				continue;
			}
			
		}
		
	

	}

}
