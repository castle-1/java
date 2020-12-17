package java_20_12_17;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public String toString() {

		return "Point(" + x + "," + y + ")";
	}

}
