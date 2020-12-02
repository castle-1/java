package Q;

public class Gugudan2 {

	public static void main(String[] args) {
		gugudan(3); // 3*3

	}

	public static void gugudan(int cols) {

		for (int dan = 2; dan < 10; dan += cols) { //단 dan+= cols는 개행후 다음단부터 시작하기위함
			//ex) cols = 3 첫 for문이 끝나고 개행 4단부터 시작
			for (int i = 1; i <= 9; i++) { //1~9
				for (int k = 0; k < cols; k++) {// n행*n열
					if ((dan + k) < 10) {
						System.out.print((dan + k) + "x" + i + "=" + ((dan + k) * i) + "\t");
					}
				}

				System.out.println();

			}
			System.out.println("--------------------------------------------------------");
		}

	}

}
