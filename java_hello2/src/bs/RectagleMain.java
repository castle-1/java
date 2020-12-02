package bs;

public class RectagleMain {

	public static void main(String[] args) {
		
		Rectagle rectagle = new Rectagle();
		
		rectagle.setHight(10);
		rectagle.setWidth(10);		
		System.out.println(rectagle.getArea());
		
		rectagle.setHight(5);
		rectagle.setWidth(5);		
		System.out.println(rectagle.getArea());

	}

}
