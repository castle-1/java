package java_20_12_09;

import java.util.Scanner;

public class Money {
	
	private int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	private int money;
	
	private void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		money = sc.nextInt();
		sc.close();
	}
	
	private void count() {
			
		for(int i = 0;i<unit.length;i++) {
			
			System.out.println(unit[i] + "원 짜리 : " + money/unit[i] + "개");
			money%=unit[i];
		}
		
		
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	
	
	public void totalRun() {
		input();
		count();
	}
	
	

}
