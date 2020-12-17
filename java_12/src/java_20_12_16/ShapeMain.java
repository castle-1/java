package java_20_12_16;

public class ShapeMain {
	
	public static void main(String[] args) { // 8번
		Shape[] list = new Shape[3];
		list[0] = new  Cirlce(10);
		
		list[1] = new Oval(20,30);
		
		list[2] = new Rect(10,40);
		
		for(int i = 0;i<list.length;i++) {
			list[i].redraw();
			
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println("면적은 "+ list[i].getArea());
		}
	}
	
	

	/*public static void main(String[] args) { //7번
		Shape donut = new Cirlce(10);
		donut.redraw();
		System.out.println("면적은" + donut.getArea() );

	}*/

}
