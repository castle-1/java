package java_20_12_04;

public class Rectangle {

	private int x, y, width, height; // 사각형을 구성하는 점과 크기

	public Rectangle(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return width * height;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")에서 " + "크기가 " + width + "x" + height + "인 사각형");
	}

	public boolean contatins(Rectangle r) {
		
		if((x < r.x) && (y < r.y) && ((x + width) > (r.x + r.width))
				&& (y + height) > (r.y + r.height)) {
			return true;
		}else {
			return false;
		}

		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
