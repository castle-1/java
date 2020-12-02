package Q;

public class Sum {

	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void getSum() {
		int total = 0;

		for (int i = 1; i <= num; i++) {
			total += i;
		}
		System.out.println(total);
	}

}
