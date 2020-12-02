package bs;

public class CircleMain {

	public static void main(String[] args) {
		
		Circle circle = new Circle(); //Circle() ->생성자
		
		circle.setR(7);
		System.out.printf("원의 넓이 : %.3f",circle.getArea());

	}

}
