package java_20_12_03;

public class Circle {
	
	private double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
		
	}

	public void setRad(double r) {
		if(r<0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	
	public double getArea() {
		return (rad*rad)*PI;
	}

}
