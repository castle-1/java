package rec;

public class Circle {
	
	double r;
	final double PI = Math.PI;
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	public double getArea() {
		return r*r*PI;
	}
	

}
