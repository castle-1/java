package java_20_12_17;

public class Point implements Cloneable {

	private int xPos;
	private int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {

		System.out.printf("[%d, %d]\n", xPos, yPos);

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); //복사함수 , '객체생성'

	}

}
