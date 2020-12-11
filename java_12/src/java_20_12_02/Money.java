package java_20_12_02;

public class Money {

	long price;
	int fiveman;
	int oneman;
	int fivecheon;
	int onecheon;
	int fivebaeg;
	int onebaeg;
	
	public Money(long price) {
		this.price = price;
		
	}
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getFiveman() {
		return (int) (price / 50000);
	}

	public void setFiveman(int fiveman) {
		this.fiveman = fiveman;
	}

	public int getOneman() {
		return (int)((price % 50000) / 10000); // 일만;
	}

	public void setOneman(int oneman) {
		this.oneman = oneman;
	}

	public int getFivecheon() {
		return (int)(((price % 50000) % 10000) / 5000); // 오천;
	}

	public void setFivecheon(int fivecheon) {
		this.fivecheon = fivecheon;
	}

	public int getOnecheon() {
		return (int)((((price % 50000) % 10000) % 5000) / 1000); // 일천
	}

	public void setOnecheon(int onecheon) {
		this.onecheon = onecheon;
	}

	public int getFivebaeg() {
		return (int)(((((price % 50000) % 10000) % 5000) % 1000) / 500); // 오백
	}

	public void setFivebaeg(int fivebaeg) {
		this.fivebaeg = fivebaeg;
	}

	public int getOnebaeg() {
		return (int)((((((price % 50000) % 10000) % 5000) % 1000) % 500) / 100); // 일백
	}

	public void setOnebaeg(int onebaeg) {
		this.onebaeg = onebaeg;
	}

	public void count() {
		System.out.println(String.format("현재금액 : %,d원", price));
		//System.out.println("현재 금액 : "+ price + "원");
		System.out.println("5만원권 : " + getFiveman() + "장");
		System.out.println("1만원권 : " + getOneman() + "장");
		System.out.println("5천원권 : " + getFivecheon() + "장");
		System.out.println("1천원권 : " + getOnecheon() + "장");
		System.out.println("500원 동전 : " + getFivebaeg()+ "개");
		System.out.println("100원 동전 : " + getOnebaeg() + "개");
	}

}
