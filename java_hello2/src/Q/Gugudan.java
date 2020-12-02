package Q;

public class Gugudan {

	int dan;

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public void printGugu(int dan) {
		System.out.println(dan + "단 까지 출력");

		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= dan; j++) {
				
				System.out.print(j + "x" + i + "=");
				System.out.printf("%4d  ", j * i);

			}
			System.out.println();
		}

		System.out.println();

	}

}
