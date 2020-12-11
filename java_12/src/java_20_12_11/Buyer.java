package java_20_12_11;


public class Buyer {

	private int money=1000;
	private Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("잔액이 부족하여" + p + "을/를 살수 없습니다.");
			return;
		}else {
			money-=p.price;
		}
		
	}
	
	

}

	class Product {
		int price;

		Product(int price) {
			this.price = price;
		}

	}
	
	class Tv extends Product{
		public Tv() {
			super(100);
		}
		public String toString() {
			return "Tv";
		}
	}
	
	class Computer extends Product{
		public Computer() {
			super(200);
		}
		public String toString() {
			return "Computer";
			
		}
	}
	
	class Audio extends Product{
		public Audio() {
			super(50);
		}
		public String toString() {
			return "Audio";
		}
	}
