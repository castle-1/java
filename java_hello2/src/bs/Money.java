package bs;

public class Money {

	long balance;
	int m5, m1, c5, c1, b5, b1;
	int temp;

	

	public void countBalance() {
		m5 = (int) balance / 50000;
		temp = (int) balance - (m5 * 50000);

		m1 = temp / 10000;
		temp = temp - (m1 * 10000);

		c5 = temp / 5000;
		temp = temp - (c5 * 5000);

		c1 = temp / 1000;
		temp = temp - (c1 * 1000);

		b5 = temp / 500;
		temp = temp - (b5 * 500);

		b1 = temp / 100;
		temp = temp - (b1 * 100);

		System.out.println(String.format("현재금액 : %,d원", balance));
		System.out.println("5만원권 : " + m5 + "장");
		System.out.println("1만원권 : " + m1 + "장");
		System.out.println("5천원권 : " + c5 + "장");
		System.out.println("1천원권 : " + c1 + "장");
		System.out.println("500원 동전 : " + b5 + "개");
		System.out.println("100원 동전 : " + b1 + "개");
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
