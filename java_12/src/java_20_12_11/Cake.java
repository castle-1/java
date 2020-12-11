package java_20_12_11;

public class Cake {
	
	public static void main(String[] args) {
		Cake c1 = new StrawberryCheeseCake();
		
		StrawberryCheeseCake c3 = new StrawberryCheeseCake();
		c1.yummy(); //다형성 적용 
		//오버라이딩은 자식꺼 오버라이딩은 자식꺼, 오버라이딩하면 부모의 함수주소를 자식이 오버라이딩한 주소로 바꿔버린다.
		
		c3.yummy();
		
	}
	
	
	public void yummy() {
		System.out.println("yummy Cake");
	}

}

class CheeseCake extends Cake{
	public void yummy() {
		System.out.println("yummy Cheese Cake");
	}
}

class StrawberryCheeseCake extends Cake{
	public void yummy() {
		
		System.out.println("StrawberryCheeseCake");
	}
	
}
