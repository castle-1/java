package java_20_12_07;



public class Sosu {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			boolean tf = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					tf = false;

				}
			}
			if(tf) {
				System.out.println(i);
			}
		}
	}

}
