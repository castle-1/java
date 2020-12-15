package java_20_12_14;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("면적의 합: " + sumArea(arr));

	}

	public static double sumArea(Shape[] arr) {
		double temp=0;
		for(int i = 0; i<arr.length; i++) {
			
			temp +=arr[i].calcArea(); //arr[i] 만 하면 주소가 들어가기때문
		}
		return temp;
	}
}
