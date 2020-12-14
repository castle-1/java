package java_20_12_11;

public class Buyer {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv()); //i = 0
		b.buy(new Computer()); //i = 1
		b.buy(new Tv()); //i = 2
		b.buy(new Audio()); //i = 3 , 배열이 2배로증가
		b.buy(new Computer());// i =4
		b.buy(new Computer()); //i = 5
		b.buy(new Computer()); // i =6

		b.summary();
	}

	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {

		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
			return;
		} else {
			money -= p.price;
			add(p);
		}

	}

	void add(Product p) {

		if (i >= cart.length) { //i=3 일때 실행
			Product[] doubleCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, doubleCart, 0, cart.length); // p의 0번부터 cart.length길이만큼 doubleCart에 복사
			cart = doubleCart; // 기존-> 새로운 장바구니 , cart에 doubleCart주소를 대입, doubleCart의 범위는 add까지
			cart[i] = p; // i=3 이기 때문에 복사한 다음번지부터 저장가능

		} else { // 장바구니보다 크지 않다면
			cart[i] = p;
			//cart[i++] = p; 도 가능 아래 i++삭제
		}
		i++;// 장바구니 크기 하나증가 else 문에 쓰면 x 3일때 i가 증가x

	}

	void summary() {
		System.out.print("구입한 물건 : ");
		for (int i = 0; i < cart.length; i++) { //배열에 저장된 상품들 출력
			System.out.print(cart[i] + ", ");
		}
		System.out.println();
		System.out.println("사용한 금액 : " + (1000 - money)); //money에는 잔액만 남아있음 따라서 초기값에서 잔액을 빼주면 얼마썼는지 알 수 있음
		System.out.println("남은 금액 : " + money);

	}

}

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}

}

class Tv extends Product {
	public Tv() {
		super(100);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";

	}
}

class Audio extends Product {
	public Audio() {
		super(50);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}
