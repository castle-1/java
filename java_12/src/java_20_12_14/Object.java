package java_20_12_14;

public class Object {

	private double num;

	public Object(double num) {
		this.num = num;
	}

	public double run() {

		return 0;

	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

}

class Circle1 extends Object {
	public Circle1(double num) {
		super(num);
	}

	@Override
	public double run() {
		return getNum() * getNum() * Math.PI;
	}

	@Override
	public String toString() {

		return "넓이는 " + run() + " 입니다.";
	}

}
