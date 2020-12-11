package java_20_12_10;

public class TV {

	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}

}

class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;

	}

	protected int getColor() {
		return color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");// super.getSize()도 가능 상속받은거라고 알기쉬움
	}

}

class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int size, int color) {

		super(size, color);
		this.address = address;
	}

	public void printProperty() {
		System.out.print(address + " 주소에 ");
		super.printProperty();
	}

}
