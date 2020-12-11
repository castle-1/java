package java_20_12_03;

public class Rcs {

	private int player;
	private final int Max = 3;
	private final int MIN = 1;
	private int com = (int) (Math.random() * Max + MIN);

	public Rcs(int player) {
		this.player = player;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public void rcsPrint() {

		String playerTemp = null;
		switch (player) {
		case 1: {

			playerTemp = "바위";
			break;
		}
		case 2: {
			playerTemp = "가위";
			break;
		}
		case 3: {
			playerTemp = "보";
			break;
		}
		}

		String comTemp = null;

		switch (com) {
		case 1: {

			comTemp = "바위";
			break;
		}
		case 2: {
			comTemp = "가위";
			break;
		}
		case 3: {
			comTemp = "보";
			break;
		}
		}

		if (player == com) {
			System.out.println("com : " + comTemp + "\n플레이어 : " + playerTemp);
			System.out.println("무승부");
		} else if (player == 1 && com == 2) {
			System.out.println("com : " + comTemp + "\n플레이어 : " + playerTemp);
			System.out.println("플레이어가 이겼습니다!!!");
		} else if (player == 1 && com == 3) {
			System.out.println("com : " + comTemp + "\n플레이어 : " + playerTemp);
			System.out.println("com이 이겼습니다!!!");
		} else if (player == 2 && com == 1) {
			System.out.println("com : " + comTemp + "\n플레이어 : " + playerTemp);
			System.out.println("com이 이겼습니다!!!");
		} else if (player == 2 && com == 3) {
			System.out.println("com : " + comTemp + "\n플레이어 : " + playerTemp);
			System.out.println("플레이어가 이겼습니다!!!");
		} else if (player == 3 && com == 1) {
			System.out.println("com : " + comTemp + "\n플레이어 : " + playerTemp);
			System.out.println("플레이어가 이겼습니다!!!");
		} else if (player == 3 && com == 2) {
			System.out.println("com : " + comTemp + "\n플레이어 : " + playerTemp);
			System.out.println("com이 이겼습니다!!!");
		}
		System.out.println();
	}

}
