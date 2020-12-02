package Q;

public class StraPrint {

	int star;

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public void printTriangle(int star) {

		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	public void printReverseTriangle(int star) {

		for (int i = star; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
