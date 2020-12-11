package java_20_12_11;

public class TV {

	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}

}

class ColorTv extends TV {
	private int color;

	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + color);

	}

}
