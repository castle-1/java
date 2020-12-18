package java_20_12_18;

public class Rectangle {
	private int height;
	private int width;

	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public static Rectangle compareRect(Rectangle x, Rectangle y) {

		return new Rectangle((x.getWidth() > y.getWidth() ? x.getWidth() : y.width),
				(x.getHeight() > y.getHeight() ? x.getHeight() : y.getHeight()));

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
